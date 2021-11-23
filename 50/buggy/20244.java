public int getInt(java.lang.String name) {
    try {
        return java.lang.Integer.parseInt(getString(name));
    } catch (java.lang.NumberFormatException e) {
        return 0;
    } catch (java.lang.NullPointerException e) {
        return 0;
    }
}