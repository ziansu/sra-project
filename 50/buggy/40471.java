public void deregisterConsoleListener(org.terasology.entitySystem.entity.EntityRef client) {
    org.terasology.computer.context.ComputerConsoleListener listener = consoleListenerMap.get(client);
    if (listener != null) {
        console.removeConsoleListener(listener);
    }
}