private boolean isNumeric(java.lang.String s) {
    try {
        java.lang.Long.parseLong(s);
    } catch (java.lang.NumberFormatException e) {
        return false;
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}