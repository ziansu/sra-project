public void throwError(java.lang.Throwable e, java.lang.String s, java.lang.Object... params) {
    if (e != null)
        logError(e, e.toString());
    
    java.lang.String message = (s == null) ? "" : (MQ7PREFIX) + (java.lang.String.format(s, params));
    throw new java.lang.RuntimeException(message);
}