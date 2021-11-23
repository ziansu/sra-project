public java.util.List<it.simonedegiacomi.goboxapi.GBFile> getAbsolutePathAsList() {
    java.util.List<it.simonedegiacomi.goboxapi.GBFile> temp = getPathAsList();
    java.lang.String[] pieces = prefix.split("/");
    for (int i = (pieces.length) - 1; i >= 0; i--)
        temp.add(0, new it.simonedegiacomi.goboxapi.GBFile(pieces[i], true));
    
    return temp;
}