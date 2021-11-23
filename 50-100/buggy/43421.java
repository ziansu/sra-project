private void exposeIdentity(final com.bitdubai.fermat_cbp_api.layer.identity.crypto_broker.interfaces.CryptoBrokerIdentity identity) throws com.bitdubai.fermat_cbp_plugin.layer.identity.crypto_broker.developer.bitdubai.version_1.exceptions.CantExposeActorIdentityException {
    try {
        com.bitdubai.fermat_api.layer.osa_android.location_system.Location location = locationManager.getLocation();
        cryptoBrokerANSManager.exposeIdentity(new com.bitdubai.fermat_cbp_api.layer.actor_network_service.crypto_broker.utils.CryptoBrokerExposingData(identity, location, com.bitdubai.fermat_p2p_api.layer.all_definition.communication.commons.enums.ProfileStatus.UNKNOWN));
    } catch (final com.bitdubai.fermat_cbp_api.layer.actor_network_service.crypto_broker.exceptions.CantExposeIdentityException e) {
        reportError(UnexpectedPluginExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_PLUGIN, e);
        throw new com.bitdubai.fermat_cbp_plugin.layer.identity.crypto_broker.developer.bitdubai.version_1.exceptions.CantExposeActorIdentityException(e, "", "Problem exposing identity.");
    } catch (com.bitdubai.fermat_api.layer.osa_android.location_system.exceptions.CantGetDeviceLocationException e) {
        throw new com.bitdubai.fermat_cbp_plugin.layer.identity.crypto_broker.developer.bitdubai.version_1.exceptions.CantExposeActorIdentityException(e, "", "Problem exposing identities in Location.");
    }
}