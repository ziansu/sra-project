private void warnOrError(java.lang.String message, java.lang.Exception e) {
    if (e == null) {
        if ((this.processLog) != null) {
            this.processLog.warn(message);
        }
    }else {
        if ((this.processLog) != null) {
            this.processLog.error(message, e);
        }
    }
}