private static float calculateFitness(int[] gene) {
    int fitness = 0;
    int faults = 0;
    for (int i = 0; i < (gene.length); i++) {
        if ((gene[i]) == 1) {
            faults++;
        }
    }
    float APFD = faults / (gene.length);
    return fitness;
}