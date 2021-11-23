public void setWorldSimulatorScreen(edu.miamioh.Level.Level level) {
    worldSimulatorController = new edu.miamioh.worldSimulator.WorldSimulatorController(level);
    worldSimulatorScreen = new edu.miamioh.worldSimulator.WorldSimulatorScreen(worldSimulatorController);
    this.setScreen(worldSimulatorScreen);
}