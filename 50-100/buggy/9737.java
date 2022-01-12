public static void main(java.lang.String[] args) {
    java.lang.String input2 = "Hello, World!";
    java.lang.String input = "In a hole in the ground there lived a hobbit. Not a nasty, dirty, wet hole, filled with the ends of worms and an oozy smell, nor yet a dry, bare, sandy hole with nothing in it to sit down on or to eat: it was a hobbit-hole and that means comfort.";
    org.aas.ga.examples.AsciiMatcherGA ga = new org.aas.ga.examples.AsciiMatcherGA(org.aas.ga.chromo.ChromosomeFactory.createDefaultChromosomes(new org.aas.ga.genes.AsciiGene(1), input2.length(), 200), 50000, 0.6, 0.4, 0.6, 0.5, input2);
    ga.setInverseFitnessRanking(true);
    ga.run();
}