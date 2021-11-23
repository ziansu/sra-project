@java.lang.Override
public void run() {
    try {
        internalRelease(entityDescriptor);
    } catch (org.terracotta.exception.EntityException e) {
        com.tc.util.Util.printLogAndRethrowError(e, logger);
    }
    closeHook.run();
}