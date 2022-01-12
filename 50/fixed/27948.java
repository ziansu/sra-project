public void actionPerformed(java.awt.event.ActionEvent ev) {
    taskList.getTasks().remove(this.myTask);
    mainPanel.removeAll();
    mainPanel.repaint();
    displayTasks();
}