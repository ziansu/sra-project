public void actionPerformed(java.awt.event.ActionEvent e) {
    controllerHandler.getGameController().pauseSimulation();
    new de.davelee.trams.gui.OptionsScreen(controllerHandler);
}