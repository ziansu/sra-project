public void setPathByString(java.lang.String pathString) {
    path = new java.util.LinkedList<>();
    java.lang.String[] stringPieces = pathString.split("/");
    for (int i = (stringPieces.length) - 1; i > 0; i--)
        path.add(new it.simonedegiacomi.goboxapi.GBFile(stringPieces[i], true));
    
    this.name = stringPieces[((stringPieces.length) - 1)];
}