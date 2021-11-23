private static void removeDead() {
    int size = assignment4.Critter.population.size();
    for (int i = 0; i < size; i++) {
        if ((assignment4.Critter.population.get(i).energy) < 1)
            assignment4.Critter.population.remove(i);
        
    }
}