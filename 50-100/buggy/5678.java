private void checkCompoundsNumbered(java.util.List<org.biojava.nbio.structure.Compound> compounds) {
    java.util.Collections.sort(compounds, new java.util.Comparator<org.biojava.nbio.structure.Compound>() {
        @java.lang.Override
        public int compare(org.biojava.nbio.structure.Compound o1, org.biojava.nbio.structure.Compound o2) {
            return new java.lang.Integer(o1.getMolId()).compareTo(o2.getMolId());
        }
    });
    int id = 1;
    for (org.biojava.nbio.structure.Compound compound : compounds) {
        org.junit.Assert.assertEquals(id, compound.getMolId());
        id++;
    }
}