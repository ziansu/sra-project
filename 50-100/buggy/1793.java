private void setUpLogger(java.lang.String name) {
    logger = java.util.logging.Logger.getLogger(name);
    if ((core.utils.Log.fh) == null) {
        try {
            core.utils.Log.fh = new java.util.logging.FileHandler(core.utils.Log.FILEPATH);
        } catch (java.io.IOException e) {
            logException(core.utils.Log.CLASSNAME, e);
        }
    }
    logger.addHandler(core.utils.Log.fh);
    logger.setUseParentHandlers(false);
}