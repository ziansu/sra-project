public java.lang.String getSyncHost() {
    java.lang.String host = m_env.getGlobalConfig().getProperty("portal.sync.host");
    if ((Env.LOCAL.equals(m_env.getEnv())) || (com.ctrip.hermes.core.utils.StringUtils.isBlank(host))) {
        return "127.0.0.1";
    }
    return host;
}