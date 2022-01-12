public void debug(java.lang.String... messages) {
    if (messages == null) {
        messages = new java.lang.String[]{ null };
    }
    for (java.lang.String message : messages) {
        res.debug(message);
    }
}