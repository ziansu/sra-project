public int getProgress() {
    int p = 0;
    java.util.Collection tasks = getTopLevelTasks();
    for (java.util.Iterator iter = tasks.iterator(); iter.hasNext();) {
        net.sf.memoranda.Task e = ((net.sf.memoranda.Task) (iter.next()));
        p += e.getProgress();
    }
    int size = tasks.size();
    return size == 0 ? 0 : p / size;
}