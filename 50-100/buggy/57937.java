@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    try {
        scriptFunction.run();
        if (java.lang.Thread.interrupted()) {
            throw new teaselib.core.ScriptInterruptedException();
        }
        script.completeAll();
        return null;
    } catch (teaselib.core.ScriptInterruptedException e) {
        script.endAll();
        throw e;
    }
}