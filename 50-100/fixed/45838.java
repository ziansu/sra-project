@java.lang.Override
public void event(org.onosproject.net.intent.IntentEvent event) {
    switch (event.type()) {
        case INSTALL_REQ :
            break;
        case INSTALLED :
            break;
        case FAILED :
            org.onosproject.optical.OpticalPathProvisioner.log.info("Intent {} failed, calling optical path provisioning app.", event.subject());
            setupLightpath(event.subject());
            break;
        default :
            break;
    }
}