@java.lang.Override
public void executeAsyncServiceCall(java.lang.String functionName, java.lang.Object[] arguments, org.sablo.websocket.IWindow window) {
    if (window == null)
        window = org.sablo.websocket.CurrentWindow.get();
    
    window.executeAsyncServiceCall(name, functionName, arguments, getParameterTypes(functionName));
}