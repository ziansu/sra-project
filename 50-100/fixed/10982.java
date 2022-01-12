private void deleteTask(java.lang.String[] taskString) {
    for (int i = 0; i < (tasks.size()); i++) {
        if (taskString[0].equals(tasks.get(i).getTitle())) {
            if (taskString[1].equals(tasks.get(i).getDescription())) {
                tasks.remove(i);
            }
        }
    }
}