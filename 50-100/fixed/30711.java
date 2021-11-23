public void findSets() {
    for (int i = 0; i < (this.reps); i++) {
        java.util.ArrayList<java.lang.Long> subSet = this.genSubset();
        long nextRes = this.findResidue(subSet);
    }
    java.lang.System.out.println(("Lowest residue found: " + (this.residue)));
}