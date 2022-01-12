@java.lang.Override
public void onStateChange(float process, com.nightonke.jellytogglebutton.State state, com.nightonke.jellytogglebutton.JellyToggleButton jtb) {
    if (state.equals(State.RIGHT)) {
        tickerview.setText("89°C");
        ledGreenState = true;
        allBool[1] = ledGreenState;
    }else
        if (state.equals(State.LEFT)) {
            ledGreenState = false;
            allBool[1] = ledGreenState;
        }
    
}