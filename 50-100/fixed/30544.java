void updateTotalLog() {
    log.entry();
    try {
        java.io.FileWriter fw = new java.io.FileWriter(((cfg.total) + (cfg.log_suffix)), false);
        fw.write(((((cfg.kw_e_total) + "|") + (cfg.kw_h_total)) + "\n"));
        fw.close();
    } catch (java.io.IOException e1) {
        log.error(org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(e1));
    }
    log.exit();
}