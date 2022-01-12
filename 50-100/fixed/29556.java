public static void main(java.lang.String[] args) {
    net.net16.jeremiahlowe.fighters.Fighters.rng = new java.util.Random();
    if (net.net16.jeremiahlowe.fighters.Fighters.DEBUG_MODE)
        net.net16.jeremiahlowe.fighters.Fighters.rng.setSeed(0);
    else
        net.net16.jeremiahlowe.fighters.Fighters.rng.setSeed(((java.lang.System.currentTimeMillis()) * (java.lang.System.nanoTime())));
    
    net.net16.jeremiahlowe.fighters.Fighters.gui = new net.net16.jeremiahlowe.fighters.GUI();
    net.net16.jeremiahlowe.fighters.Fighters.gui.setVisible(true);
    net.net16.jeremiahlowe.fighters.Fighters.addFPSsystem();
    net.net16.jeremiahlowe.fighters.ai.GenerationController.spawnNewGenerationFromScratch(net.net16.jeremiahlowe.fighters.Fighters.GENE_LENGTH, true, 0);
}