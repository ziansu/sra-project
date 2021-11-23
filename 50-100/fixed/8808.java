@java.lang.Override
public de.hshannover.f4.trust.visitmeta.gui.util.RestConnection copy() {
    de.hshannover.f4.trust.visitmeta.gui.util.RestConnection tmp = new de.hshannover.f4.trust.visitmeta.gui.util.RestConnection(getDataserviceConnection(), getName());
    tmp.setUrl(getUrl());
    tmp.setUsername(getUsername());
    tmp.setPassword(getPassword());
    tmp.setTruststorePath(getTruststorePath());
    tmp.setTruststorePass(getTruststorePass());
    tmp.setMaxPollResultSize(getMaxPollResultSize());
    tmp.setAuthenticationBasic(isAuthenticationBasic());
    tmp.setStartupConnect(isStartupConnect());
    return tmp;
}