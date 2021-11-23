public static java.lang.Throwable unwrapIfRequired(java.lang.Throwable e) {
    while (((e instanceof java.util.concurrent.CompletionException) || (e instanceof java.util.concurrent.ExecutionException)) && ((e.getCause()) != null)) {
        e = e.getCause();
    } 
    return e;
}