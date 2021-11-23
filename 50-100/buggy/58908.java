public void execute(final java.lang.Runnable asyncCode, final java.lang.Runnable onSuccess) {
    execute(new javafx.concurrent.Task<java.lang.Void>() {
        @java.lang.Override
        protected java.lang.Void call() throws java.lang.Exception {
            asyncCode.run();
            return null;
        }
    }, (java.lang.Void result) -> {
        if (onSuccess != null) {
            onSuccess.run();
        }
    });
}