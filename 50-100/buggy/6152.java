public static <T extends aurelienribon.texturepackergui.AppEvents.BaseAppEventListener> void fireEventToListeners(java.lang.Class<T> listenersClass) {
    java.lang.Object[] listeners = aurelienribon.texturepackergui.AppEvents.listenerList.getListenerList();
    for (int i = (listeners.length) - 2; i >= 0; i -= 2)
        if ((listeners[i]) == listenersClass)
            ((T) (listeners[(i + 1)])).onEvent();
        
    
}