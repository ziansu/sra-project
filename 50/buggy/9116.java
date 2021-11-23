@java.lang.Override
public void execute() {
    try {
        command.execute();
    } catch (java.lang.Exception e) {
        gwtLogger.warn(e.getMessage(), e);
    }
}