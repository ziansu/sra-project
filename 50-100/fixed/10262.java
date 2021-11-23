public void connectSimModel(final thesis.core.SimModel simModel, final thesis.gui.mainwindow.actions.Actions actions) {
    renderWorld = new thesis.core.world.RenderSimState(simModel);
    this.addMouseListener(mouseState);
    this.addMouseMotionListener(mouseState);
    renderWorld.setBounds(0, 0, getWidth(), getHeight());
    for (thesis.gui.mainwindow.actions.renderopts.RenderOptAction action : actions.getRenderOptions()) {
        action.connectToModel(renderWorld.getRenderOptions());
    }
}