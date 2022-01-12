@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.io.PrintWriter delete;
    try {
        delete = new java.io.PrintWriter(fileTo);
        delete.print("");
        delete.close();
        hasFile = false;
        setEnabled(false);
        if (fileTo.toString().equalsIgnoreCase(gui.GUI4.getLastUsedFile().toString())) {
            gui.GUI4.setLastUsedFile("");
        }
    } catch (java.io.FileNotFoundException e1) {
        e1.printStackTrace();
    }
}