@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    java.lang.System.out.println("VALUE CHANGED");
    selectedStop = stops[newVal];
    updateTimes();
}