@java.lang.Override
public void onClick(android.view.View v) {
    if ((led_state) == true) {
        led_state = false;
    }else {
        led_state = true;
    }
    java.lang.System.out.println(("Button click: " + (led_state)));
    protocol.digitalWrite(PIN_NUMBER, (led_state ? ((byte) (1)) : 0));
}