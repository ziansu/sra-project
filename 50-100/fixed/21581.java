@java.lang.Override
public void detach() {
    java.util.List<WT> wrappedBaseList = getWrappedBaseList();
    int i = 0;
    for (WT el : wrappedBaseList) {
        detach(i, el, false, true);
        i++;
    }
    webObjectContext = null;
    changeMonitor = null;
}