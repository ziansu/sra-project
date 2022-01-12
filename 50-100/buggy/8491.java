@java.lang.Override
public void attachToBaseObject(final org.sablo.IChangeListener changeMonitor, org.sablo.IWebObjectContext webObjectContext) {
    this.changeMonitor = changeMonitor;
    this.webObjectContext = webObjectContext;
    java.util.List<WT> wrappedBaseList = getWrappedBaseList();
    int i = 0;
    for (WT el : wrappedBaseList) {
        attachToBaseObject(i, el, false);
        i++;
    }
    if (isChanged())
        changeMonitor.valueChanged();
    
}