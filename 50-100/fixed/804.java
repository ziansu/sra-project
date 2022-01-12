public void add(java.lang.String key, org.entirej.applicationframework.rwt.layout.EJRWTEntireJStackedPane.StackedPage control) {
    if ((_stackLayout.topControl) == null) {
        _stackLayout.topControl = control.getControl();
        active = key;
    }
    _panes.put(key, control);
    _pages.add(control);
}