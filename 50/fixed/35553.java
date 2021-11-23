@java.lang.Override
protected void restoreState(java.lang.Object[] data) {
    window.restoreState(((java.lang.Object[]) (data[0])));
    window.reSchedule();
}