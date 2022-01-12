private int totalAverageFitness() {
    int total = 0;
    for (int s = 0; s < (getSpecies().size()); s++) {
        com.starflask.JavaNESBrain.evolution.Species specie = getSpecies().get(s);
        total = total + (specie.getAverageFitness());
    }
    return total;
}