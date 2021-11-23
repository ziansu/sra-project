public java.lang.String getPrintableOperationLog(android.content.res.Resources resources, int indent) {
    java.lang.StringBuilder log = new java.lang.StringBuilder();
    for (org.sufficientlysecure.keychain.operations.results.OperationResult.LogEntryParcel entry : this) {
        log.append(entry.getPrintableLogEntry(resources, indent)).append("\n");
    }
    if ((log.length()) >= 1) {
        return log.toString().substring(0, ((log.length()) - 1));
    }else {
        return log.toString();
    }
}