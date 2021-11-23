@java.lang.Override
public boolean start() {
    if (isSAMLPluginEnabled()) {
        org.apache.cloudstack.saml.SAML2AuthManagerImpl.s_logger.info("SAML auth plugin loaded");
        return setup();
    }else {
        org.apache.cloudstack.saml.SAML2AuthManagerImpl.s_logger.info("SAML auth plugin not enabled so not loading");
        return super.start();
    }
}