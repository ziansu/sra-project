protected void simulateThinking() {
    int sleepRange = ((edu.caltech.cs141b.hw2.gwt.collab.client.Collaborator.THINKING_RANGE_END) - (edu.caltech.cs141b.hw2.gwt.collab.client.Collaborator.THINKING_RANGE_START)) + 1;
    int waitingTime = ((int) ((edu.caltech.cs141b.hw2.gwt.collab.client.Collaborator.THINKING_RANGE_START) + (sleepRange * (java.lang.Math.random())))) + 1;
    thinkingTimer.schedule(waitingTime);
}