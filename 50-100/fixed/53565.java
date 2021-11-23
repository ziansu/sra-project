@java.lang.Override
protected void setup(com.google.inject.Binder binder) {
    io.airlift.configuration.ConfigBinder.configBinder(binder).bindConfig(org.rakam.plugin.ScheduledTaskModule.TaskConfig.class);
    com.google.inject.multibindings.Multibinder<org.rakam.server.http.HttpService> httpServices = com.google.inject.multibindings.Multibinder.newSetBinder(binder, org.rakam.server.http.HttpService.class);
    httpServices.addBinding().to(org.rakam.plugin.tasks.ScheduledTaskHttpService.class);
    binder.bind(java.lang.String.class).annotatedWith(com.google.inject.name.Names.named("timestamp_function")).toProvider(org.rakam.plugin.ScheduledTaskModule.DatabaseFunction.class);
}