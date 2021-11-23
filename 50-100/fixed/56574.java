@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent arg0) {
    centralapp.model.Department dpt = view.getDpt();
    dpt.setName(view.getName());
    centralapp.model.Employee futureManager = view.getManager();
    if (futureManager != null) {
        dpt.setManager(new centralapp.model.Manager(futureManager));
        futureManager.removeEmployee();
    }
    mainControler.notifyDptListModification();
}