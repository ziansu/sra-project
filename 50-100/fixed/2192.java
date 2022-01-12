private void sendAck() {
    try {
        long processDeliveryTag = org.apache.airavata.gfac.core.GFacUtils.getProcessDeliveryTag(processContext.getCuratorClient(), processContext.getExperimentId(), processId);
        org.apache.airavata.gfac.impl.Factory.getProcessLaunchConsumer().sendAck(processDeliveryTag);
        org.apache.airavata.gfac.impl.GFacWorker.log.info("expId: {}, procesId: {} :- Sent ack for deliveryTag {}", processContext.getExperimentId(), processId, processDeliveryTag);
    } catch (java.lang.Exception e1) {
        java.lang.String format = java.text.MessageFormat.format("expId: {0}, processId: {1} :- Couldn't send ack for deliveryTag ", processContext.getExperimentId(), processId);
        org.apache.airavata.gfac.impl.GFacWorker.log.error(format, e1);
    }
}