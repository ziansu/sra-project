public static void main(java.lang.String[] args) throws java.io.FileNotFoundException {
    Persistence p = Persistence.init();
    javax.swing.SwingUtilities.invokeLater(new Window(p));
}