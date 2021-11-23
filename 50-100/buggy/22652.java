@java.lang.Override
public void paint(java.awt.Graphics g, javax.swing.JComponent c) {
    super.paint(g, c);
    if (c instanceof javax.swing.JEditorPane) {
        java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
        paintInfo(((javax.swing.JEditorPane) (c)).getText(), g2, c.getBackground().darker());
    }
}