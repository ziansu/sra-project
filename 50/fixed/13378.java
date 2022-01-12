public final void initialize() {
    if (initialized)
        return ;
    
    if ((definition) == null) {
        tk.fusselrulezz.ets2editor.util.Logger.printMessage(Level.WARNING, "A definition has to be set before initializing a SettingsMenuItem!");
        return ;
    }
    onInitialize();
    initialized = true;
}