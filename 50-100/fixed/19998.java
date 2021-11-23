public java.util.List<domain.Allergeen> geefAllergenen() throws java.sql.SQLException {
    java.util.List<domain.Allergeen> result = null;
    try {
        allergeenDAO.startTransaction();
        result = allergeenDAO.findAll();
        allergeenDAO.stopTransaction();
    } catch (java.lang.Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(null, (("Fout in de databank.\n" + ("Stuur volgende foutmelding door naar de ontwikkelaar:\n\n" + "Fout in AllergeenService.geefAllergenen(): \n")) + (ex.getMessage())));
    }
    return result;
}