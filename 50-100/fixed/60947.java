private void undoUpdateFloatingTask() {
    for (int i = 0; i < (floatingTasksList.size()); i++) {
        if ((floatingTasksList.get(i).getIndex()) == (prevModIndex)) {
            floatingTasksList.remove(i);
            floatingTasksList.add(i, prevModFloatingTask);
            Tempo.Calendar.indexStore.replaceTask(prevModIndex, prevModFloatingTask);
            break;
        }
    }
}