public domain.Allergeen geefAllergeen(java.lang.String allergeen) {
    domain.Allergeen a = null;
    try {
        allergeenDAO.startTransaction();
        a = allergeenDAO.findBy(allergeen);
        allergeenDAO.stopTransaction();
    } catch (java.lang.Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(null, (("Fout in de databank.\n" + ("Stuur volgende foutmelding door naar de ontwikkelaar: \n\n" + "Fout in AllergeenService.geefAllergeen(): \n")) + (ex.getMessage())));
    }
    return a;
}