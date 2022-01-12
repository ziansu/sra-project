private void mutate(java.util.BitSet partOne) {
    for (int i = 0; i < (this.length); i++) {
        if ((rnd.nextFloat()) < (Simulator.perComponentMutationRate)) {
            partOne.flip(i);
        }
    }
}