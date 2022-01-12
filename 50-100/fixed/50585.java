@java.lang.Override
public java.lang.Integer run() {
    try {
        java.lang.String setting = com.google.common.io.Files.toString(new java.io.File(io.dropwizard.jetty.NetUtil.TCP_BACKLOG_SETTING_LOCATION), com.google.common.base.Charsets.UTF_8);
        return java.lang.Integer.parseInt(setting.trim());
    } catch (java.lang.SecurityException | java.io.IOException | java.lang.NumberFormatException | java.lang.NullPointerException e) {
        return tcpBacklog;
    }
}