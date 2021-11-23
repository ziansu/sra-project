public boolean isOkToQuery(java.lang.String id) {
    try {
        queryTextbook(id);
        return true;
    } catch (java.lang.RuntimeException e) {
        e.printStackTrace();
        return false;
    }
}