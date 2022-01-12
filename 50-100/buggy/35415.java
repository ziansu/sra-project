private void removeEventLoggingModules() {
    java.util.List<module.Module> eventLoggingModules = new java.util.ArrayList<>();
    for (module.Module module : mModules) {
        if (module instanceof module.log.EventLogger) {
            eventLoggingModules.add(module);
        }
    }
    for (module.Module eventLoggingModule : eventLoggingModules) {
        removeModule(eventLoggingModule);
    }
}