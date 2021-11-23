void initialize() throws net.percederberg.mibble.MibLoaderException {
    int errors = log.errorCount();
    for (net.percederberg.mibble.MibImport imp : imports) {
        try {
            imp.initialize(log);
            if (loaded) {
                imp.validateSmiVersion(log, this);
            }
        } catch (net.percederberg.mibble.MibException e) {
            log.addError(e);
        }
    }
    if (errors != (log.errorCount())) {
        throw new net.percederberg.mibble.MibLoaderException(log);
    }
}