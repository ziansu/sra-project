public void callBeforeApplicationCreateBootstraps() {
    if ((!(args.isLoadExtensions())) || ((args.getBootstrapClassNames()) == null)) {
        return ;
    }
    extensionLoader.runBeforeApplicationCreateBootstrap(instrumentation, args.getBootstrapClassNames().split(","));
}