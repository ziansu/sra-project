private void logHeader(java.lang.StringBuilder builder) {
    if (showThreadInfo) {
        builder.append(com.ns.greg.library.fancy_logger.Printer.TOP_BORDER).append(com.ns.greg.library.fancy_logger.Printer.NEW_LINE).append(com.ns.greg.library.fancy_logger.Printer.HORIZONTAL_LINE).append(com.ns.greg.library.fancy_logger.Printer.THREAD_TITLE).append(java.lang.Thread.currentThread().getName()).append(com.ns.greg.library.fancy_logger.Printer.NEW_LINE);
    }else {
        builder.append(com.ns.greg.library.fancy_logger.Printer.TOP_BORDER).append(com.ns.greg.library.fancy_logger.Printer.NEW_LINE);
    }
}