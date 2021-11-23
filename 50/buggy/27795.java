@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    try {
        com.company.Main.onRepaint(g);
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Error in onRepaint.");
        e.printStackTrace();
    }
}