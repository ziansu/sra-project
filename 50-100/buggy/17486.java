private void jniExit(int pid, long code, int signal) {
    processList.remove(pid);
    if ((processList.containsKey(pid)) && ((processList.get(pid).exitListener) != null)) {
        processList.get(pid).exitListener.listener(code, signal);
    }
}