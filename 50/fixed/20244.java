public int getInt(java.lang.String name) {
    try {
        java.lang.String string = getString(name);
        if (string != null)
            return java.lang.Integer.parseInt(string);
        
    } catch (java.lang.NumberFormatException e) {
    }
    return 0;
}