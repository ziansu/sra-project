public void enqueue(org.openhab.binding.zwave.internal.protocol.SerialMessage serialMessage) {
    org.openhab.binding.zwave.internal.protocol.ZWaveNode node = getNode(serialMessage.getMessageNode());
    if ((node != null) && (node.doesMessageRequireEncapsulation(serialMessage))) {
        org.openhab.binding.zwave.internal.protocol.commandclass.ZWaveSecurityCommandClass securityCommandClass = ((org.openhab.binding.zwave.internal.protocol.commandclass.ZWaveSecurityCommandClass) (node.getCommandClass(CommandClass.SECURITY)));
        securityCommandClass.queueMessageForEncapsulation(serialMessage);
        return ;
    }
    this.sendQueue.add(serialMessage);
    org.openhab.binding.zwave.internal.protocol.ZWaveController.logger.debug("Enqueueing message. Queue length = {}", this.sendQueue.size());
}