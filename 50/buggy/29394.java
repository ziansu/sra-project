public void startWriter() {
    future = executor.submit(this);
    mysCon.addMySensorsOutboundMessage(org.openhab.binding.mysensors.protocol.MySensorsWriter.I_VERSION_MESSAGE);
}