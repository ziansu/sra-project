protected int registerTimeTask(T newTask) {
    int key = newTask.hashCode();
    tasks.put(key, newTask);
    return key;
}