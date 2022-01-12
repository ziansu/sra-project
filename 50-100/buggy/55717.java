public static java.lang.Throwable unwrapIfRequired(java.lang.Throwable e) {
    if (((e instanceof java.util.concurrent.CompletionException) || (e instanceof java.util.concurrent.ExecutionException)) && ((e.getCause()) != null)) {
        return e.getCause();
    }
    return e;
}