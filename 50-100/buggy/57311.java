public void receivedNewDigitalAssetMetadataNotificationEvent(com.bitdubai.fermat_pip_api.layer.platform_service.event_manager.events.ReceivedNewDigitalAssetMetadataNotificationEvent event) throws com.bitdubai.fermat_dap_api.layer.dap_transaction.common.exceptions.CantSaveEventException {
    java.util.logging.Logger LOG = java.util.logging.Logger.getGlobal();
    LOG.info(("ASSET RECEPTION EVENT TEST, I GOT AN EVENT:\n" + event));
    startMonitorAgent();
    this.assetReceptionDao.saveNewEvent(event.getEventType().getCode(), event.getSource().getCode());
    LOG.info("ASSET RECEPTION CHECK THE DATABASE");
}