@java.lang.Override
public void onResume(boolean multitasking) {
    if ((eidReader) != null) {
        eidReader.resume();
    }
    super.onResume(multitasking);
}