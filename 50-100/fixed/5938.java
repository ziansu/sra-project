private void undoUpdateTask() {
    for (int i = 0; i < (tasksList.size()); i++) {
        if ((tasksList.get(i).getIndex()) == (prevModIndex)) {
            tasksList.remove(i);
            tasksList.add(i, prevModTask);
            java.util.Collections.sort(tasksList);
            Tempo.Calendar.indexStore.replaceTask(prevModIndex, prevModTask);
            break;
        }
    }
}