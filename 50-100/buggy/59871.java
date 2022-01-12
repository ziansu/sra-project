public java.lang.String[] getAllNames() {
    java.lang.System.out.println(searchTable);
    java.lang.String[] names = new java.lang.String[searchTable.size()];
    java.util.Enumeration<java.lang.String> keys = searchTable.keys();
    int i = 0;
    while (keys.hasMoreElements()) {
        names[i] = keys.nextElement();
        i++;
    } 
    return names;
}