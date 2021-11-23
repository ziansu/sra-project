pszt_scheduling.Population.Individual[] performCrossingOver() {
    pszt_scheduling.Population.Individual[] parents = new pszt_scheduling.Population.Individual[2];
    parents[0] = rouletteWheelSelection();
    while (true) {
        parents[1] = rouletteWheelSelection();
        if (!(parents[0].equals(parents[1])))
            break;
        
    } 
    return crossover(parents[0], parents[1]);
}