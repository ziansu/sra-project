public void remove(java.lang.String name) {
    int firstSpace = name.indexOf(" ");
    java.lang.String firstName = name.substring(0, firstSpace);
    java.lang.String lastName = name.substring(firstSpace).trim();
    int key = java.lang.Math.abs((firstName + lastName).toUpperCase().hashCode());
    int hash = key % (HashMap.TABLE_SIZE);
    table[hash] = null;
}