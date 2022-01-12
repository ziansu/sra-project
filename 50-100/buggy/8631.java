private void removeWeakSpecies() {
    int sum = totalAverageFitness();
    for (int s = 1; s < (getSpecies().size()); s++) {
        com.starflask.JavaNESBrain.evolution.Species specie = getSpecies().get(s);
        float breed = com.starflask.JavaNESBrain.utils.FastMath.floor((((specie.averageFitness) / sum) * (Population)));
        if (breed < 1) {
            species.remove(specie);
        }
    }
}