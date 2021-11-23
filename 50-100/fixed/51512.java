public static java.lang.String getErrorMessage(java.lang.Throwable e) {
    return (((e.getCause()) != null ? ((e.getClass().getSimpleName()) + ": ") + (e.getCause().toString()) : e.getClass().getSimpleName()) + ": ") + (e.getMessage());
}