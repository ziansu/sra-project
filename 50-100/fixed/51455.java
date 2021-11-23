private static boolean init() {
    if (org.yj.smtpstub.configuration.Configuration.isInit) {
        return true;
    }
    java.io.InputStream in = org.yj.smtpstub.configuration.Configuration.config.getClass().getResourceAsStream(org.yj.smtpstub.configuration.Configuration.CONFIG_FILE);
    synchronized(org.yj.smtpstub.configuration.Configuration.config) {
        if (in == null) {
            org.yj.smtpstub.configuration.Configuration.config.clear();
            return false;
        }
        try {
            org.yj.smtpstub.configuration.Configuration.config.load(in);
            in.close();
            return true;
        } catch (java.io.IOException e) {
            org.slf4j.LoggerFactory.getLogger(org.yj.smtpstub.configuration.Configuration.class).error("", e);
        }
    }
    return false;
}