public void refreshIcon() {
    this.remove(icon);
    try {
        icon = new javax.swing.JLabel(loadIcon());
        add(java.awt.BorderLayout.SOUTH, icon);
    } catch (edu.ncssm.iwp.exceptions.CannotLoadIconX x) {
        java.lang.System.err.println(("[GShape_Bitmap_Designer] Refresh Error: " + x));
        x.printStackTrace();
    }
    this.revalidate();
    this.repaint();
}