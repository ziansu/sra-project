void initialize() throws net.percederberg.mibble.MibLoaderException {
    int errors = log.errorCount();
    for (net.percederberg.mibble.MibImport imp : imports) {
        imp.initialize(log);
        if (loaded) {
            imp.validateSmiVersion(log, this);
        }
    }
    if (errors != (log.errorCount())) {
        throw new net.percederberg.mibble.MibLoaderException(log);
    }
}