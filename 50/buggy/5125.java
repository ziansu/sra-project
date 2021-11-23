@org.junit.Test
public void sendTest() throws java.lang.Exception {
    testClient.send(edu.kit.pse17.go_app.ClientCommunication.Downstream.FcmClientTest.testData, edu.kit.pse17.go_app.ClientCommunication.Downstream.FcmClientTest.testEvent, edu.kit.pse17.go_app.ClientCommunication.Downstream.FcmClientTest.testReceiver);
    java.lang.System.out.println();
}