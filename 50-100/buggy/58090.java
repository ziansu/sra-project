public static void start() {
    com.SiliconSharks.Controller.CustomKeyboard.start();
    switch (com.SiliconSharks.Settings.getSetting("NumGamepad")) {
        case 0 :
            {
                com.SiliconSharks.Controller.ControlSystem.gamepads = new com.SiliconSharks.Controller.Gamepad[0];
            }
        case 1 :
            {
                com.SiliconSharks.Controller.ControlSystem.gamepads = new com.SiliconSharks.Controller.Gamepad[]{ new com.SiliconSharks.Controller.Gamepad(0) };
            }
        case 2 :
            {
                com.SiliconSharks.Controller.ControlSystem.gamepads = new com.SiliconSharks.Controller.Gamepad[]{ new com.SiliconSharks.Controller.Gamepad(0) , new com.SiliconSharks.Controller.Gamepad(0) };
            }
    }
}