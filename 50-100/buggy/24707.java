public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Client...");
    configuration.Configuration.event_threads = java.lang.Integer.parseInt(args[0]);
    if ((configuration.Configuration.event_threads) == 0) {
        configuration.Configuration.approach = configuration.FilterApproach.SEQUENTIAL;
    }
    matching.MatchingEngine matchingEngine = new matching.MatchingEngine();
    matchingEngine.addSubscriptionsFolder("Subscriptions");
    matchingEngine.addEventsFolder("Events");
    matchingEngine.closeMatchingEngine();
    java.lang.System.out.println("END");
}