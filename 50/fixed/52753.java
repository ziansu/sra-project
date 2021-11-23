@com.starbattle.tests.cucumber.After
public void tidyUp() {
    com.starbattle.client.testinterface.main.ClientTestInterface.shutdown();
}