private java.util.List<RequestProcessor> setupSimulation() throws java.lang.InterruptedException {
    java.util.List<RequestProcessor> executors = new java.util.ArrayList<RequestProcessor>();
    for (long i = 0; i < (RequestLoadSimulator.NUMBER_OF_REQUESTS); i++) {
        RequestProcessor requestProcessor = new RequestProcessor(i, RequestLoadSimulator.AVG_QUERIES_PER_REQUEST, RequestLoadSimulator.AVG_QUERY_TIME_MILLIS, RequestLoadSimulator.NTH_PRIME_TO_FIND, new Callback() {
            @java.lang.Override
            public void execute() {
                incrementNumComplete();
            }
        });
        executors.add(requestProcessor);
    }
    java.lang.System.out.println(((RequestLoadSimulator.NUMBER_OF_REQUESTS) + " requests were created"));
    return executors;
}