public java.lang.String getString(java.lang.String s) {
    java.lang.Object o = root.get(s);
    if (o == null) {
        return null;
    }else {
        return ((java.lang.String) (root.get(s)));
    }
}