public static void main(java.lang.String[] args) {
    long startTime = java.lang.System.currentTimeMillis();
    neuronalnetworks.Test.findTheRightOneRAM(484, 485, 1, 1.1, 0.2);
    long endTime = java.lang.System.currentTimeMillis();
    long totalTime = (endTime - startTime) / 1000;
    neuronalnetworks.Test.tempsExecution(totalTime);
}