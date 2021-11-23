@java.lang.Override
protected info.hearit.pluginslib.BaseModule newModule(android.app.Notification notification) {
    return new info.hearit.pluginsample.PluginAudioModule(notification, 1, 2);
}