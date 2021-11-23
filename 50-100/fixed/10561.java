@java.lang.Override
public void start() {
    scenes.WorldScene.WorldSystem.NPC n = ((scenes.WorldScene.WorldSystem.WorldSystem) (parent)).activeNPC;
    java.awt.FontMetrics fm = javax.swing.JFrame.getFrames()[0].getGraphics().getFontMetrics();
    dialog = engine.StringUtils.wrap(n.getDialog(), fm, ((engine.ContentPanel.INTERNAL_RES_W) - 10)).toArray(new java.lang.String[]{  });
    index = 0;
}