@java.lang.Override
public double solve() {
    int cycles = 0;
    long startTime = java.lang.System.nanoTime();
    do {
        step();
        cycles++;
    } while ((!(settled())) && (cycles < (MAX_CYCLES)) );
    long endTime = java.lang.System.nanoTime();
    solutionTime = endTime - startTime;
    harmony = calcHarmony(currentActivations);
    solutionTruth = activationsToTruth(currentActivations);
    return harmony;
}