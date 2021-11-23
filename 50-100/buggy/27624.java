public void remove(domain.Gerecht gerecht) {
    try {
        gerechtDAO.startTransaction();
        gerechtDAO.delete(gerecht);
        gerechtDAO.saveChanges();
        gerechtDAO.stopTransaction();
    } catch (java.lang.Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(null, ((((("Fout in de databank.\n" + ("Stuur volgende foutmelding door naar de ontwikkelaar:\n\n" + "Fout in GerechtService.remove(): \n")) + (ex.getMessage())) + "\n") + "Stack: ") + (ex.getStackTrace().toString())));
    }
}