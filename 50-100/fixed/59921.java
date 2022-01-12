@java.lang.Override
protected void logConfig(java.io.PrintStream logger, java.lang.String prefix) {
    super.logConfig(logger, prefix);
    logger.println(((prefix + "Mode: ") + (model.getMode().toString())));
    logger.println(((prefix + "Data model: ") + (model.getDataModel().toString())));
    logger.println(((prefix + "Performance model: ") + (model.getPerformanceModel().toString())));
}