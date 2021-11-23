public void addProcess(java.lang.String processName, kr.iamghost.kurum.ProcessWatcherListener l) {
    watchList.add(processName);
    addEventListener(l);
}