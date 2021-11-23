@java.lang.Override
public void drawChild(vague.module.Module m) {
    java.lang.System.err.println("drawing child");
    graphics.drawImage(m.render(), m.x(), m.y(), null);
    drawWindow();
}