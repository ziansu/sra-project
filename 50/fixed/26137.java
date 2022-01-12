public synchronized void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    if (command.equals("paste")) {
        fileManager.setPastInterrupted(true);
    }else {
        fileManager.setDeleteInterrupted(true);
    }
    dispose();
}