@java.lang.Override
public com.codebrig.beam.messages.BeamMessage messageReceived(com.codebrig.beam.SystemCommunicator comm, com.codebrig.beam.messages.BeamMessage message) {
    if (comm.isTestingConnection()) {
        comm.handleMessage(new com.codebrig.beam.messages.SystemMessage(message).toBeamMessage());
        return null;
    }
    return new com.codebrig.beam.messages.SystemMessage(com.codebrig.beam.messages.SystemMessageType.TEST_CONNECTION).toBeamMessage();
}