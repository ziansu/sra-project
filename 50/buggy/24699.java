public boolean canUpdate() {
    try {
        java.lang.Object data = getToPoints().get(0).fetchData();
        if (data instanceof java.lang.String) {
            return true;
        }
    } catch (java.lang.Exception e) {
        return false;
    }
    return false;
}