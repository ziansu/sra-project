private static void removeDead() {
    int size = assignment4.Critter.population.size();
    for (int i = size - 1; i >= 0; i--) {
        if ((assignment4.Critter.population.get(i).energy) < 1)
            assignment4.Critter.population.remove(i);
        
    }
}