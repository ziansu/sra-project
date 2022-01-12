private static boolean shouldContinue(com.google.pubsub.flic.common.LoadtestProto.StartRequest request, int numberOfMessages) {
    switch (request.getStopConditionsCase()) {
        case STOP_TIME :
            return (java.lang.System.currentTimeMillis()) < ((request.getStopTime().getSeconds()) * 1000);
        case NUMBER_OF_MESSAGES :
            return (com.google.pubsub.clients.common.LoadTestRunner.client.getNumberOfMessages()) == (request.getNumberOfMessages());
    }
    return false;
}