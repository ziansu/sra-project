@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        java.io.PrintWriter delete = new java.io.PrintWriter(fileTo);
        delete.print("");
        delete.close();
        setEnabled(false);
        if (gui.GUI4.getLastUsedFile().toString().equalsIgnoreCase(fileTo.toString())) {
            gui.GUI4.setLastUsedFile("");
        }
    } catch (java.io.FileNotFoundException e1) {
        e1.printStackTrace();
    }
}