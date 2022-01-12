public void addError(junit.framework.Test test, java.lang.Throwable t) {
    if (activator.isTrace()) {
        activator.trace("  add error to %s : %s", test, t);
    }else {
        systemErr.capture(false);
        try {
            activator.message("", "TEST %s <<< ERROR: %s", test, t);
        } finally {
            systemErr.capture(true);
        }
    }
    check();
}