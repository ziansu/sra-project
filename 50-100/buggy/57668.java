@java.lang.Override
protected org.sonatype.gshell.shell.Shell createShell() throws java.lang.Exception {
    java.util.List<com.google.inject.Module> modules = new java.util.ArrayList<com.google.inject.Module>();
    configure(modules);
    com.google.inject.Injector injector = com.google.inject.Guice.createInjector(Stage.PRODUCTION, new org.eclipse.sisu.wire.WireModule(modules));
    container.add(injector, 0);
    org.sonatype.gshell.shell.ShellImpl shell = injector.getInstance(org.sonatype.gshell.shell.ShellImpl.class);
    injector.getInstance(org.sonatype.gshell.command.registry.CommandRegistrar.class).registerCommands();
    return shell;
}