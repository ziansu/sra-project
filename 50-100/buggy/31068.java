public java.lang.String remove(java.lang.String name) {
    int firstSpace = name.indexOf(" ");
    java.lang.String firstName = name.substring(0, firstSpace);
    java.lang.String lastName = name.substring(firstSpace).trim();
    int key = (firstName + lastName).toUpperCase().hashCode();
    int hash = key % (HashMap.TABLE_SIZE);
    table[hash] = null;
}