private void respondReceiveAndDoneCommunication(com.bitdubai.fermat_ccp_plugin.layer.network_service.intra_user.developer.bitdubai.version_1.structure.ActorNetworkServiceRecord actorNetworkServiceRecord) {
    actorNetworkServiceRecord.changeState(ActorProtocolState.DONE);
    actorNetworkServiceRecord.changeDescriptor(NotificationDescriptor.RECEIVED);
    actorNetworkServiceRecord = changeActor(actorNetworkServiceRecord);
    communicationNetworkServiceConnectionManager.getNetworkServiceLocalInstance(actorNetworkServiceRecord.getActorDestinationPublicKey()).sendMessage(actorNetworkServiceRecord.getActorSenderPublicKey(), actorNetworkServiceRecord.getActorDestinationPublicKey(), actorNetworkServiceRecord.toJson());
}