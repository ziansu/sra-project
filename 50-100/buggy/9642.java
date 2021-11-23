private void submitToErrorPort(java.lang.Exception e) {
    if (validErrorPort) {
        com.ibm.streams.operator.StreamingOutput<com.ibm.streams.operator.OutputTuple> streamingOutput = getOutput(0);
        com.ibm.streams.operator.OutputTuple otup = streamingOutput.newTuple();
        otup.setString(0, e.getMessage());
        try {
            streamingOutput.submit(otup);
        } catch (java.lang.Exception e1) {
            e1.printStackTrace();
        }
    }
}