@java.lang.Override
public final void close() {
    final java.lang.ClassLoader current = java.lang.Thread.currentThread().getContextClassLoader();
    java.lang.Thread.currentThread().setContextClassLoader(this.backupCl);
    if (!(current.equals(this.backupCl))) {
        de.skuzzle.tinyplugz.ExchangeClassLoader.LOG.warn("Detected 3rd party ClassLoader exchange");
        de.skuzzle.tinyplugz.Require.state((!(this.failOnChange)), "Detected 3rd party ClassLoader exchange");
    }
}