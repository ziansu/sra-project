@java.lang.Override
public void onStateChange(float process, com.nightonke.jellytogglebutton.State state, com.nightonke.jellytogglebutton.JellyToggleButton jtb) {
    if (state.equals(State.RIGHT)) {
        tickerview.setText("85°C");
        ledBlueState = true;
        allBool[2] = ledBlueState;
    }else
        if (state.equals(State.LEFT)) {
            ledBlueState = false;
            allBool[2] = ledBlueState;
        }
    
}