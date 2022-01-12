public final java.lang.String getRemoteHost() {
    java.lang.String remote = this.getHeader("X-Forwarded-For");
    if (remote == null) {
        remote = getHeader("X-Real-IP");
        if (remote == null) {
            remote = req.getRemoteAddr();
        }
    }
    return remote;
}