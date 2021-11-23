@org.junit.Before
public void setup() {
    org.mockito.MockitoAnnotations.initMocks(this);
    sc = new java.util.Scanner(java.lang.System.in);
    display = new arduino.UserInterface();
    rfob = new arduino.ReadFromOutputBuffer(odroid);
    rst = new arduino.ReadSpeedAndTorque(rfob);
    readSpeed = new arduino.runReadSpeed(display, rst);
    input = new arduino.runInput(display);
}