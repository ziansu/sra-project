protected java.util.List<java.lang.String> splitQueryString(java.lang.String query) {
    int index = 0;
    final int qLen = query.length();
    java.util.List<java.lang.String> blocks = new java.util.ArrayList<java.lang.String>();
    while ((index + (seqSize)) < qLen) {
        blocks.add(query.substring(index, (index + (seqSize))));
        index += window;
    } 
    return blocks;
}