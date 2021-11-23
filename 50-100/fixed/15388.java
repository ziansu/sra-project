java.lang.StringBuilder convert(java.lang.String start, java.lang.String end) {
    res = new java.lang.StringBuilder();
    res.append(start);
    res.append("\n");
    createHeader();
    res.append("\n");
    createNodeList();
    res.append("\n");
    createEdgeList();
    res.append(end);
    res.append("\n");
    return res;
}