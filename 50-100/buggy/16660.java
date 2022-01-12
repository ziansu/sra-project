public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    int progress;
    if (isChecked) {
        progress = seekCPU.getProgress();
        CPUCalc(progress, true, textCPUN);
    }else {
        progress = seekCPU.getProgress();
        CPUCalc(progress, false, textCPUN);
    }
}