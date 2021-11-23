@java.lang.Override
public java.util.List<java.lang.String> getStringList(java.lang.String path) {
    java.util.List<java.lang.String> newStringList = new java.util.LinkedList<java.lang.String>();
    if (isString(path))
        return java.util.Arrays.asList(getString(path));
    
    java.util.List<java.lang.String> stringList = super.getStringList(path);
    for (java.lang.String string : stringList) {
        string = de.tobiyas.util.config.YAMLConfigExtended.replaceUmlauts(string);
        newStringList.add(string);
    }
    return newStringList;
}