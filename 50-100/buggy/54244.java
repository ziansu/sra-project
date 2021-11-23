public static void main(java.lang.String[] args) {
    MainWindow mainWindow = new MainWindow("Worms");
    try {
        GameLogic.setUp(mainWindow);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    java.awt.EventQueue.invokeLater(mainWindow);
}