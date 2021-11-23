public void mutateAllele() {
    int rand = ((int) ((java.lang.Math.random()) * 20));
    if (rand == 1) {
        int allele = ((int) ((java.lang.Math.random()) * (StarcraftAI.Gene.GENE_SIZE)));
        int newVal = ((int) ((java.lang.Math.random()) * (java.lang.Integer.MAX_VALUE)));
        gene.set(allele, newVal);
        geneClone.set(allele, newVal);
    }
}