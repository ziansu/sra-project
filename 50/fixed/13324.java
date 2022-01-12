public static void closeDela() {
    if ((fr.umlv.unitex.DelaFrame.frame) == null) {
        return ;
    }
    fr.umlv.unitex.DelaFrame.frame.setVisible(false);
    java.lang.System.gc();
}