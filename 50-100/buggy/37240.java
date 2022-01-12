public static void main(final java.lang.String[] args) {
    try {
        ym2151.MainJFrame frame = new ym2151.MainJFrame();
        frame.loadPatch(((args.length) == 1 ? args[0] : null));
        frame.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}