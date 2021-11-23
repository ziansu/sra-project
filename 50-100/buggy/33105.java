@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progressValue, boolean fromUser) {
    progress = progressValue;
    textCPU.setText(((progress) + ""));
    if (toggleCPU.getText().equals("AMD")) {
        tempB = true;
    }
    if (toggleCPU.getText().equals("Intel")) {
        tempB = false;
    }
    CPUCalc(progress, tempB, textCPUN);
}