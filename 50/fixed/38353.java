public static org.openbaton.catalogue.nfvo.messages.Interfaces.NFVMessage getNfvErrorMessage(org.openbaton.catalogue.mano.record.VirtualNetworkFunctionRecord payload, java.lang.Throwable exception, java.lang.String nsrId) {
    org.openbaton.catalogue.nfvo.messages.Interfaces.NFVMessage nfvMessage;
    nfvMessage = new org.openbaton.common.vnfm_sdk.utils.VnfmOrErrorMessage(new java.lang.Exception(exception), payload, nsrId);
    nfvMessage.setAction(Action.ERROR);
    return nfvMessage;
}