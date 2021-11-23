public void processClause(java.util.List lause, java.util.List returnList) throws java.lang.Exception {
    lause.add(".");
    for (int i = 0; i < (lause.size()); i++) {
        returnList.add(((lause.get(i)) + " * * * * * * * * *"));
    }
}