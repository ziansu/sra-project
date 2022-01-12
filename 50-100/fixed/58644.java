public void addOneRowOfResult(java.lang.Object rowResult) {
    if ((matchResult) == null) {
        matchResult = new java.util.ArrayList<>();
    }
    if (rowResult instanceof java.lang.Object[]) {
        matchResult.add(((java.lang.Object[]) (rowResult)));
    }
}