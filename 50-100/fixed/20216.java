@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent arg0) {
    java.lang.String newDptName = view.getName();
    centralapp.model.Company company = mainControler.getCompany();
    centralapp.model.Department newDpt = new centralapp.model.Department(newDptName, company);
    centralapp.model.Employee futureManager = view.getManager();
    if (futureManager != null) {
        newDpt.setManager(new centralapp.model.Manager(futureManager));
        futureManager.removeEmployee();
    }
    mainControler.notifyDptListModification();
}