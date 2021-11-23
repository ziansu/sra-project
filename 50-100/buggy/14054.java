@java.lang.Override
public void onClick(android.view.View v) {
    if ((led_state) == 0) {
        led_state = 1;
    }else {
        led_state = 0;
    }
    java.lang.System.out.println(("Button click: " + (led_state)));
    protocol.digitalWrite(PIN_NUMBER, led_state);
}