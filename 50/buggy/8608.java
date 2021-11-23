private void changeActor(com.bitdubai.fermat_ccp_plugin.layer.network_service.intra_user.developer.bitdubai.version_1.structure.ActorNetworkServiceRecord actorNetworkServiceRecord) {
    java.lang.String actorDestination = actorNetworkServiceRecord.getActorDestinationPublicKey();
    actorNetworkServiceRecord.setActorDestinationPublicKey(actorNetworkServiceRecord.getActorSenderPublicKey());
    actorNetworkServiceRecord.setActorSenderPublicKey(actorDestination);
}