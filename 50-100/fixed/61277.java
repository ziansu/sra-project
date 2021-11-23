public int getNotFunTaskID(task[] tasks) {
    for (int i = 0; i < (tasks.length); i++) {
        if ((!(tasks[i].fun)) && (!(tasks[i].used))) {
            return i;
        }
    }
    return -1;
}