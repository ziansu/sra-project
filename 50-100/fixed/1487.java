public javax.swing.JPanel getMap() {
    java.lang.System.out.println("Started");
    this.worldWindPanel = new gov.nasa.worldwind.awt.WorldWindowGLJPanel();
    this.worldWindPanel.setModel(new gov.nasa.worldwind.BasicModel());
    this.worldWindPanel.getInputHandler().addSelectListener(new gov.nasa.worldwind.util.BasicDragger(this.worldWindPanel));
    this.layer = new gov.nasa.worldwind.layers.RenderableLayer();
    this.worldWindPanel.getModel().getLayers().add(this.layer);
    this.worldWindPanel.getInputHandler().addMouseListener(getMouseListener());
    return this.worldWindPanel;
}