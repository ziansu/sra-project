@java.lang.Override
public void paint(java.awt.Graphics g) {
    java.awt.Graphics2D ga = ((java.awt.Graphics2D) (g));
    ga.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
    setText(ALLQ[choosedSub][CurrentNum[choosedSub]]);
    drawaString(g, ALLC[choosedSub][CurrentNum[choosedSub]][2], 20, 32);
}