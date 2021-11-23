public boolean isFaved(java.lang.String title) {
    boolean found = false;
    if (title != null) {
        java.lang.String idstring = prefs.getString("ids", null);
        if (idstring != null) {
            found = (idstring.indexOf(title)) > 0;
        }else {
            found = false;
        }
    }
    return found;
}