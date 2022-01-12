protected void simulateEating() {
    int currentInd = tb.getSelectedTab();
    tabContents.get(currentInd).setHTML((((tabContents.get(currentInd).getHTML()) + (channelToken)) + "<br />"));
    int eatRange = ((edu.caltech.cs141b.hw2.gwt.collab.client.Collaborator.EATING_RANGE_END) - (edu.caltech.cs141b.hw2.gwt.collab.client.Collaborator.EATING_RANGE_START)) + 1;
    int waitingTime = ((int) ((edu.caltech.cs141b.hw2.gwt.collab.client.Collaborator.EATING_RANGE_START) + (eatRange * (java.lang.Math.random())))) + 1;
    eatingTimer.schedule(waitingTime);
}