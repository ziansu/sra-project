private static java.lang.String stringify(java.util.List<it.simonedegiacomi.goboxapi.GBFile> list) {
    if (list == null)
        return null;
    
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    boolean first = true;
    for (it.simonedegiacomi.goboxapi.GBFile piece : list) {
        if ((!first) && ((piece.getName().length()) > 0))
            builder.append('/');
        
        builder.append(piece.getName());
        if (first)
            first = false;
        
    }
    return builder.toString();
}