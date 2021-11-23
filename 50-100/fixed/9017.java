public void crossover(ga.Genes genes) {
    java.util.Random rand = new java.util.Random();
    for (int i = 2; i < (genes.getNum()); i += 2) {
        int cuttingPoint = (rand.nextInt(((genes.getDim()) - 1))) + 1;
        ga.Gene.shiftDNASection(genes.getAt(i), genes.getAt((i + 1)), cuttingPoint, genes.getDim());
    }
}