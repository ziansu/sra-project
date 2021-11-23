@java.lang.Deprecated
public final void dispose() {
    if (disposed)
        return ;
    
    java.lang.System.out.println(("Disposing of BaseConsole with id of " + (getId())));
    java.util.ArrayList<com.n9mtq4.logwindow.listener.ListenerContainer> listenerContainers1 = getListenerContainers();
    for (com.n9mtq4.logwindow.listener.ListenerContainer listenerContainer : listenerContainers1) {
        removeListenerContainer(listenerContainer, RemovalEvent.CONSOLE_DISPOSE);
    }
    java.util.ArrayList<com.n9mtq4.logwindow.ui.UIContainer> uiContainers1 = getUIContainers();
    for (com.n9mtq4.logwindow.ui.UIContainer uiContainer : uiContainers1) {
        removeUiContainer(uiContainer);
    }
}