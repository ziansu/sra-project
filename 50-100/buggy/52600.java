private java.lang.Integer getIntProp(java.lang.String name) {
    java.lang.String s = getStringProp(name);
    if (s != null) {
        try {
            int i = java.lang.Integer.parseInt(s);
            return new java.lang.Integer(i);
        } catch (java.lang.NumberFormatException nfe) {
            return null;
        }
    }
    return null;
}