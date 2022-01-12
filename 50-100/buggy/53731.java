@org.junit.BeforeClass
public static void runBeforeTests() {
    com.rugged.application.hestia.BackendInteractorTest.backendInteractor = hestia.backend.BackendInteractor.getInstance();
    hestia.backend.ActivatorState<java.lang.Boolean> testState = new hestia.backend.ActivatorState<java.lang.Boolean>(false, "TOGGLE");
    hestia.backend.Activator testButton = new hestia.backend.Activator(0, testState, "testButton");
    java.util.ArrayList<hestia.backend.Activator> arr = new java.util.ArrayList<>();
    arr.add(testButton);
    hestia.backend.Device testDevice = new hestia.backend.Device(0, "testDevice", "testing", arr);
    com.rugged.application.hestia.BackendInteractorTest.backendInteractor.addDevice(testDevice);
}