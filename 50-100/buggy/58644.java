public void addOneRowOfResult(java.lang.Object rowResult) {
    if ((matchResult) == null) {
        matchResult = new java.util.ArrayList<java.lang.Object[]>();
    }
    if (rowResult instanceof java.lang.String[]) {
        matchResult.add(((java.lang.String[]) (rowResult)));
    }
}