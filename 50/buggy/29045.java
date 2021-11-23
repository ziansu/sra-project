public boolean isOkToQuery(java.lang.String id) {
    try {
        cmput301.textbookhub.Models.Textbook b = queryTextbook(id);
        return true;
    } catch (java.lang.RuntimeException e) {
        e.printStackTrace();
        return false;
    }
}