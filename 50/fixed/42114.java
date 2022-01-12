public static void removePedal() {
    if ((board.MainClass2.surface.getComponentCount()) > 1) {
        board.MainClass2.surface.remove(0);
        board.MainClass2.surface.repaint();
    }
}