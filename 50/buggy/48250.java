public static void onReset() {
    net.net16.jeremiahlowe.fighters.ai.GenerationController.killCurrentGeneration();
    net.net16.jeremiahlowe.fighters.ai.GenerationController.spawnNewGenerationFromScratch(net.net16.jeremiahlowe.fighters.Fighters.GENE_LENGTH);
}