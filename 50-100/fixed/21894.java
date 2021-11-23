@java.lang.Override
public void processStateLinks(final java.util.Set<java.lang.String> stateLinks) throws io.subutai.core.hubmanager.api.HubPluginException {
    for (java.lang.String link : stateLinks) {
        java.util.regex.Matcher environmentDataMatcher = io.subutai.core.hubmanager.impl.proccessors.VehsProccessor.ENVIRONMENT_PEER_DATA_PATTERN.matcher(link);
        if (environmentDataMatcher.matches()) {
            io.subutai.hub.share.dto.environment.EnvironmentPeerDto envPeerDto = getEnvPeerDto(link);
            if (envPeerDto != null) {
                setupHS(envPeerDto);
            }
        }
    }
}