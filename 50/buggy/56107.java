@java.lang.Override
public boolean start() {
    if (isSAMLPluginEnabled()) {
        setup();
        org.apache.cloudstack.saml.SAML2AuthManagerImpl.s_logger.info("SAML auth plugin loaded");
    }else {
        org.apache.cloudstack.saml.SAML2AuthManagerImpl.s_logger.info("SAML auth plugin not enabled so not loading");
    }
    return super.start();
}