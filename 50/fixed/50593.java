private static void loadConfig() {
    com.iquanwai.platon.biz.util.ConfigUtils.config = com.typesafe.config.ConfigFactory.load("localconfig");
    com.iquanwai.platon.biz.util.ConfigUtils.fileconfig = com.typesafe.config.ConfigFactory.parseFile(new java.io.File("/data/config/localconfig"));
    com.iquanwai.platon.biz.util.ConfigUtils.config = com.iquanwai.platon.biz.util.ConfigUtils.fileconfig.withFallback(com.iquanwai.platon.biz.util.ConfigUtils.config);
}