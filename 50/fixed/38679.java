phylo.Tree SelectForDeath() {
    java.util.Random rnd = new java.util.Random();
    return pop.remove(rnd.nextInt(pop.size()));
}