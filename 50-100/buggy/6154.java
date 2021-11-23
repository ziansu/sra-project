public java.lang.String[] getNames() {
    java.lang.String[] names = new java.lang.String[agents.size()];
    int i = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : agents.entrySet()) {
        names[i] = entry.getKey();
        java.lang.System.out.println(("names: " + (names[i])));
        i++;
    }
    return names;
}