@java.lang.Deprecated
public final void addToConsole(com.n9mtq4.logwindow.BaseConsole baseConsole) {
    if ((!(linkedBaseConsoles.contains(baseConsole))) || (!(baseConsole.getListenerContainers().contains(this)))) {
        linkedBaseConsoles.add(baseConsole);
        baseConsole.addListenerContainerRaw(this);
        init();
    }
}