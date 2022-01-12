public void start() {
    this.active = true;
    org.lanternpowered.launch.console.ConsoleLaunch.setFormatter(new org.lanternpowered.server.console.ColoredConsoleFormatter());
    final jline.console.ConsoleReader reader = org.lanternpowered.launch.console.ConsoleLaunch.getReader();
    reader.addCompleter(new org.lanternpowered.server.console.ConsoleCommandCompleter());
    java.lang.Thread thread = new java.lang.Thread(this::commandReaderTask);
    thread.setName("ConsoleCommandThread");
    thread.setDaemon(true);
    thread.start();
}