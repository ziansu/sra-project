@java.lang.Override
public void execute() {
    if (!(isExecutable())) {
        throw new java.lang.RuntimeException("The execute()-method of the command was called while it wasn't executable.");
    }else {
        if (inBackground) {
            if (!(super.isRunning())) {
                reset();
                start();
            }
        }else {
            try {
                actionSupplier.get().action();
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }
}