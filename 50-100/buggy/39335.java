@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.widget.TextView textLog = ((android.widget.TextView) (findViewById(R.id.textView1)));
    jp.ksksue.driver.serial.FTDriver driver = new jp.ksksue.driver.serial.FTDriver(((android.hardware.usb.UsbManager) (getSystemService(com.example.robotwasd.USB_SERVICE))));
    robot = new com.example.robotwasd.Robot(driver, textLog);
    robot.initialize();
}