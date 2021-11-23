private static void init() {
    java.io.InputStream in = org.yj.smtpstub.configuration.Configuration.config.getClass().getResourceAsStream(org.yj.smtpstub.configuration.Configuration.CONFIG_FILE);
    synchronized(org.yj.smtpstub.configuration.Configuration.config) {
        if (in == null) {
            org.yj.smtpstub.configuration.Configuration.config.clear();
            org.yj.smtpstub.configuration.Configuration.isInit = true;
            return ;
        }
        try {
            org.yj.smtpstub.configuration.Configuration.config.load(in);
            in.close();
            org.yj.smtpstub.configuration.Configuration.isInit = true;
        } catch (java.io.IOException e) {
            org.slf4j.LoggerFactory.getLogger(org.yj.smtpstub.configuration.Configuration.class).error("", e);
        }
    }
}