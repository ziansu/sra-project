@java.lang.Override
public void run() {
    long customFilter = org.wysaid.nativePort.CGENativeLibrary.cgeCreateCustomNativeFilter(customFilterIndex, 1.0F, false);
    mCameraView.getRecorder().setNativeFilter(customFilter);
}