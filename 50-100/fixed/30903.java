public void clearActivatedTopics() throws java.util.concurrent.ExecutionException {
    java.util.List<java.lang.String> topicsList = ((java.util.List<java.lang.String>) (alDialogProxy.getActivatedTopics().get()));
    java.lang.System.out.println(("Activated Topics: " + topicsList));
    for (java.lang.String topic : topicsList) {
        java.lang.System.out.println(("Topic: " + topic));
        alDialogProxy.deactivateTopic(topic);
        java.lang.System.out.println("Topic deleted");
    }
    java.lang.System.out.println(("Activated Topics: " + (alDialogProxy.getActivatedTopics().get())));
}