public static java.lang.String getErrorMessage(java.lang.Throwable e) {
    return (((e.getCause()) != null ? e.getCause().toString() : e.getClass().getSimpleName()) + ": ") + (e.getMessage());
}