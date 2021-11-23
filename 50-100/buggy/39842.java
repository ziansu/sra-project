public void addFailure(junit.framework.Test test, junit.framework.AssertionFailedError t) {
    if (activator.isTrace()) {
        activator.trace("  add failure to %s : %s", test, t);
    }else {
        systemErr.capture(false);
        try {
            activator.message("", "TEST %s <<< FAILURE: %s", test, t);
        } finally {
            systemErr.capture(true);
        }
    }
    check();
    (fails)++;
}