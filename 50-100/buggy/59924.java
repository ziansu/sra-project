public void run() {
    try {
        rUBERn.ClientBase base = new rUBERn.ClientBase();
        rUBERn.Matrix theMatrix = new rUBERn.Matrix(base);
        rUBERn.MatrixGUI window = new rUBERn.MatrixGUI(theMatrix);
        window.Main.setVisible(true);
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}