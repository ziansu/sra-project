protected static final void logDebug(int recDepth, java.lang.String message) {
    de.glmtk.querying.estimator.Estimator.LOGGER.debug("%s%s", de.glmtk.util.StringUtils.repeat("  ", recDepth), message);
}