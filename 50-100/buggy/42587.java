public void processClause(java.util.List lause, java.util.List returnList) throws java.lang.Exception {
    lause.add(".");
    for (int i = 0; i < (returnList.size()); i++) {
        returnList.add(((returnList.get(i)) + " * * * * * * * * *"));
    }
}