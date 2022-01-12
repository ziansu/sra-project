private boolean isNumeric(java.lang.String s) {
    int num;
    try {
        num = java.lang.Integer.parseInt(s);
    } catch (java.lang.NumberFormatException e) {
        return false;
    } catch (java.lang.NullPointerException e) {
        return false;
    }
    if (num < 0)
        return false;
    
    return true;
}