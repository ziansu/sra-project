public void execute(final java.lang.Runnable asyncCode, final java.lang.Runnable onSuccess) {
    execute(() -> {
        asyncCode.run();
        return null;
    }, (java.lang.Void result) -> {
        if (onSuccess != null) {
            onSuccess.run();
        }
    });
}