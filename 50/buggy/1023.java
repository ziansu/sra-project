@java.lang.SuppressWarnings(value = "WeakerAccess")
protected java.lang.Runnable toRunnable(final com.github.dakusui.actionunit.Action action) {
    return new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            action.accept(com.github.dakusui.actionunit.visitors.ActionRunner.this);
        }
    };
}