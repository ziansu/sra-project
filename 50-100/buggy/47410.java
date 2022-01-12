public void run() {
    try {
        javax.swing.UIManager.setLookAndFeel(new org.pushingpixels.substance.api.skin.SubstanceGraphiteGlassLookAndFeel());
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Substance Graphite failed to initialize");
    }
    try {
        javax.swing.UIManager.setLookAndFeel(new org.pushingpixels.substance.api.skin.SubstanceGraphiteGlassLookAndFeel());
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Substance Graphite failed to initialize");
    }
    try {
        main.AnimeIndex frame = new main.AnimeIndex();
        frame.setVisible(true);
        main.AnimeIndex.completedList.setSelectedIndex(0);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}