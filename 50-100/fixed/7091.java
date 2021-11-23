protected java.util.List<java.lang.String> splitQueryString(java.lang.String query) {
    final int qLen = query.length();
    java.util.List<java.lang.String> blocks = new java.util.ArrayList<java.lang.String>();
    for (int index = 0; (index + (seqSize)) < qLen; index += window) {
        blocks.add(query.substring(index, (index + (seqSize))));
    }
    return blocks;
}