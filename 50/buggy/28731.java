public void reset() {
    IntermediateHost.userInput = 0;
    IntermediateHost.packetType = 0;
    IntermediateHost.packetNum = 0;
    IntermediateHost.delayTime = 0;
    IntermediateHost.corruptRequest = 0;
    IntermediateHost.wrongOpCode = new byte[2];
    IntermediateHost.wrongBlockNum = new byte[2];
}