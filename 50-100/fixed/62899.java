@lombok.SneakyThrows
@javax.annotation.Nonnull
public static com.alesharik.webserver.control.dashboard.websocket.DashboardWebSocketPlugin newInstanceForName(@javax.annotation.Nonnull
java.lang.String name, @javax.annotation.Nonnull
com.alesharik.webserver.control.dashboard.websocket.WebSocketSender webSocketSender) {
    try {
        if (!(com.alesharik.webserver.control.dashboard.websocket.DashboardWebSocketPluginManager.plugins.containsKey(name))) {
            throw new com.alesharik.webserver.exceptions.PluginNotFoundException(name);
        }
        java.lang.reflect.Constructor<?> constructor = com.alesharik.webserver.control.dashboard.websocket.DashboardWebSocketPluginManager.plugins.get(name).getConstructor(com.alesharik.webserver.control.dashboard.websocket.WebSocketSender.class);
        constructor.setAccessible(true);
        return ((com.alesharik.webserver.control.dashboard.websocket.DashboardWebSocketPlugin) (constructor.newInstance(webSocketSender)));
    } catch (java.lang.reflect.InvocationTargetException | java.lang.InstantiationException e) {
        throw new java.lang.RuntimeException(e);
    }
}