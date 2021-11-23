private void runTest() {
    switch (10) {
        case 10 :
            this.responderIntegrationTest.testRespondingProcessWithMockedTrueDecision();
            break;
        case 11 :
            this.responderIntegrationTest.testRespondingProcessWithMockedFalseDecision();
            break;
        case 20 :
            this.respondingDecisionIntegrationTest.testRespondingDecisionInIsolation();
            break;
        case 21 :
            this.respondingDecisionIntegrationTest.testRespondingDecisionInIsolationContinously();
            break;
    }
}