public void run() {
    try {
        rUBERn.ClientBase base = new rUBERn.ClientBase();
        rUBERn.Matrix theMatrix = new rUBERn.Matrix(base);
        rUBERn.MatrixGUI window = new rUBERn.MatrixGUI(theMatrix);
        window.Main.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}