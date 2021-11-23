@java.lang.Override
public void onStateChange(float process, com.nightonke.jellytogglebutton.State state, com.nightonke.jellytogglebutton.JellyToggleButton jtb) {
    if (state.equals(State.LEFT)) {
        tickerview.setText("65°C");
        led2State = true;
        allBool[0] = led2State;
    }else
        if (state.equals(State.RIGHT)) {
            led2State = false;
            allBool[0] = led2State;
        }
    
}