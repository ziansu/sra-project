@org.junit.Before
public void addTestDevice() {
    hestia.backend.ActivatorState<java.lang.Boolean> testState = new hestia.backend.ActivatorState(false, "TOGGLE");
    hestia.backend.Activator testButton = new hestia.backend.Activator(com.rugged.application.hestia.BackendInteractorTest.TEST_ACTIVATOR_ID, 0, testState, "testButton");
    java.util.ArrayList<hestia.backend.Activator> arr = new java.util.ArrayList<>();
    arr.add(testButton);
    hestia.backend.Device testDevice = new hestia.backend.Device(com.rugged.application.hestia.BackendInteractorTest.TEST_DEVICE_ID, "testDevice", "testing", arr);
}