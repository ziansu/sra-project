static void loadUnicodeDela(java.io.File dela) {
    if ((fr.umlv.unitex.DelaFrame.frame) == null) {
        fr.umlv.unitex.DelaFrame.init();
    }
    fr.umlv.unitex.DelaFrame.frame.text.load(dela);
    fr.umlv.unitex.DelaFrame.frame.text.setFont(fr.umlv.unitex.Config.getCurrentTextFont());
    fr.umlv.unitex.DelaFrame.frame.setTitle(dela.getAbsolutePath());
    fr.umlv.unitex.DelaFrame.frame.setVisible(true);
    try {
        fr.umlv.unitex.DelaFrame.frame.setIcon(false);
        fr.umlv.unitex.DelaFrame.frame.setSelected(true);
    } catch (java.beans.PropertyVetoException e2) {
        e2.printStackTrace();
    }
}