@com.starbattle.tests.cucumber.After
public void tidyUp() {
    com.starbattle.client.testinterface.main.ClientTestInterface.shutdown();
    com.starbattle.tests.cucumber.StepDefinitions.server.shutdown(null);
}