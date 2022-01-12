public static void main(final java.lang.String[] args) {
    ym2151.MainJFrame frame = new ym2151.MainJFrame();
    try {
        frame.loadPatch(((args.length) == 1 ? args[0] : null));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    frame.setVisible(true);
}