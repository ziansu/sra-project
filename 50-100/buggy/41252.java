@java.lang.Override
public void robotInit() {
    mechanum = new com.coderedrobotics.libs.MechanumDrive(new com.coderedrobotics.libs.PWMController(com.coderedrobotics.uri.statics.Wiring.FRONT_LEFT_MOTOR, false), new com.coderedrobotics.libs.PWMController(com.coderedrobotics.uri.statics.Wiring.FRONT_RIGHT_MOTOR, true), new com.coderedrobotics.libs.PWMController(com.coderedrobotics.uri.statics.Wiring.REAR_LEFT_MOTOR, false), new com.coderedrobotics.libs.PWMController(com.coderedrobotics.uri.statics.Wiring.REAR_RIGHT_MOTOR, true));
    keyMap = new com.coderedrobotics.uri.statics.KeyMap();
    leds = new com.coderedrobotics.libs.ControlsBoxLEDs(com.coderedrobotics.uri.statics.Wiring.RED_AND_GREEN_LEDS, com.coderedrobotics.uri.statics.Wiring.BLUE_LEDS);
    lift = new com.coderedrobotics.libs.PWMController(com.coderedrobotics.uri.statics.Wiring.LIFT_MOTOR, true);
}