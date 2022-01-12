public static void main(java.lang.String[] args) {
    ch.zbw.karteiSystem.ViewMainFrame mainframe = new ch.zbw.karteiSystem.ViewMainFrame();
    mainframe.setSize(800, 600);
    java.awt.Dimension dimension = new java.awt.Dimension(800, 600);
    mainframe.setMinimumSize(dimension);
    mainframe.setVisible(true);
    java.lang.System.out.println((((mainframe.getMainHandler().getPercentOfRights()) + "  ") + (mainframe.getMainHandler().getScore())));
}