public boolean isSpecialCombination() {
    boolean res = false;
    if ((((this.getType()) == (main.java.group37.bejeweled.model.Combination.Type.FLAME)) | ((this.getType()) == (main.java.group37.bejeweled.model.Combination.Type.STAR))) | ((this.getType()) == (main.java.group37.bejeweled.model.Combination.Type.HYPERCUBE))) {
        res = true;
    }
    return res;
}