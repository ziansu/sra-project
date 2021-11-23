private void setReceivingMode() {
    java.lang.String receivingMode = this.serviceRequest.getValues().get(org.egov.pgr.model.VALUES_RECIEVING_MODE);
    if (receivingMode != null)
        this.complaint.setReceivingMode(org.egov.pgr.entity.enums.ReceivingMode.valueOf(receivingMode));
    
}