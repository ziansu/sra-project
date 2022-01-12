public int modifyField(java.lang.String field, java.lang.String value, java.lang.Long id) {
    if ((field != null) && (value != null)) {
        try {
            it.ispw.efco.nottitranquille.controller.ManageLocation.modifyField(field, value, id);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    return 0;
}