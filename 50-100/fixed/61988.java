@java.lang.Override
public void run() {
    try {
        org.eclipse.xtext.xbase.lib.IntegerRange _upTo = new org.eclipse.xtext.xbase.lib.IntegerRange(1, 20);
        for (final java.lang.Integer i : _upTo) {
            {
                log.<java.lang.String>record(delight.log.jre.Logs.string("log1", ("t1 entry " + i)));
                java.lang.Thread.sleep(1);
                java.lang.Thread.yield();
            }
        }
    } catch (java.lang.Throwable _e) {
        throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
    }
}