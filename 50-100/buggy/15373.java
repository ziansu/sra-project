private java.lang.String[] shopToString(java.util.List<com.parse.ParseObject> objects) {
    java.lang.String[] s = new java.lang.String[objects.size()];
    for (int i = 0; i < (s.length); i++) {
        s[i] = ((objects.get(i).getString("username")) + ", ") + (objects.get(i).getString("address"));
    }
    return s;
}