public void actionPerformed(java.awt.event.ActionEvent e) {
    if ("Quit".equals(e.getActionCommand())) {
        if (checkChangesMade()) {
            popUpAlert();
        }
        java.lang.System.exit(0);
    }
    if ("Reset".equals(e.getActionCommand())) {
        reset();
    }
    if ("File".equals(e.getActionCommand())) {
        menu();
    }
}