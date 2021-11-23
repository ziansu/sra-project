@java.lang.Override
public void onClick(android.view.View v) {
    state = STATE_STOP;
    this.sendCommand("9");
}