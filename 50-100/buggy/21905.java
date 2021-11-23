@java.lang.Override
protected void configure() {
    bind(net.vazem.jdbc.IConnector.class).to(net.vazem.jdbc.impl.Connector.class);
    bind(net.vazem.observe.Observer.class).to(net.vazem.util.AMessageReceiver.class);
    bind(net.vazem.util.AMessageReceiver.class).to(net.vazem.util.CsvMessageReceiver.class);
    bind(net.vazem.gui.AFrame.class).to(net.vazem.gui.CsvFrame.class);
    bind(net.vazem.observe.Observable.class).to(net.vazem.gui.AFrame.class);
    bind(net.vazem.util.file.IFileFunctions.class).to(net.vazem.util.file.FileFunctions.class).in(com.google.inject.Singleton.class);
}