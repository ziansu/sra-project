public static void flush() {
    lib2D.window.Canvas c = lib3D.engine.Engine.currentWnd.getCanvas();
    lib3D.engine.Engine.clear(c);
    lib3D.engine.Engine.drawBuffer(c);
    c.repaint();
}