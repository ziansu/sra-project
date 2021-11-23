protected int getMissingResponses() {
    return (getExpectedResponses()) - (receivedResponses);
}