public void actionPerformed(java.awt.event.ActionEvent ev) {
    sorted = true;
    taskList.getSortedTasks().clear();
    taskList.updateSortedList(taskList.getTasks(), taskList.getSortedTasks());
    java.util.Collections.sort(taskList.getSortedTasks(), taskList.compareByName());
    mainPanel.removeAll();
    mainPanel.revalidate();
    mainPanel.repaint();
    displayTasks();
}