public static void main(java.lang.String[] args) {
    long startTime = java.lang.System.currentTimeMillis();
    neuronalnetworks.Test.findTheRightOneRAM(484, 485, 1, 1.1, 0.2);
    neuronalnetworks.Test.saveNeuralNetworks();
    java.lang.System.out.println("Le meilleur reseau de neurones determine a ete sauvegarde");
    long endTime = java.lang.System.currentTimeMillis();
    long totalTime = (endTime - startTime) / 1000;
    neuronalnetworks.Test.tempsExecution(totalTime);
}