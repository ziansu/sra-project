private java.lang.String[] getNames() {
    java.lang.String[] names = new java.lang.String[client.length];
    for (int x = 0; x < (client.length); x++) {
        names[x] = client[x].getName();
    }
    return names;
}