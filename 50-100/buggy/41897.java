pszt_scheduling.Population.Individual[] performCrossingOver() {
    pszt_scheduling.Population.Individual[] parents = new pszt_scheduling.Population.Individual[2];
    for (int i = 0; i < 2; i++)
        parents[i] = rouletteWheelSelection();
    
    return crossover(parents[0], parents[1]);
}