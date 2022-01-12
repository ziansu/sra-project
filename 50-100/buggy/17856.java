@java.lang.Override
public void close() {
    try {
        settings.save();
        plugin.disableAll();
        nl.jortenmilo.console.Console.close();
        java.lang.System.exit(0);
    } catch (java.lang.Error | java.lang.Exception e) {
        new java.lang.UnknownError(e.toString(), e.getMessage()).print();
    }
}