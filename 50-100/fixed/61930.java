public java.lang.String Loeschen() {
    deleteMetadataDirectory();
    try {
        this.dao.remove(this.myProzess);
    } catch (de.sub.goobi.helper.exceptions.DAOException e) {
        de.sub.goobi.helper.Helper.setFehlerMeldung("could not delete ", e);
        return "";
    }
    if (this.modusAnzeige.equals("vorlagen")) {
        return FilterVorlagen();
    }else {
        return FilterAlleStart();
    }
}