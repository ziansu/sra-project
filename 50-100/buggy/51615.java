public int getFitness() {
    int sum = 0;
    for (int i = 0; i < (sequence.length); i++) {
        if (sequence[i]) {
            sum += possibleNumbers[(i + 1)];
        }
    }
    int fitness = 0;
    if (sum > (goal)) {
        fitness += (goal) - sum;
    }else {
        fitness += sum;
    }
    if (!(isSequenceValid())) {
        fitness -= goal;
    }
    return fitness;
}