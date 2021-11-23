public void actionPerformed(java.awt.event.ActionEvent e) {
    parent.setProgBar_loading(((i)++));
    if ((i) > 100) {
        timer.stop();
        parent.executeTasks();
    }
}