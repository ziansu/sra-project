@java.lang.Override
public void onUpdate(float value) {
    shutter.getShutterControl().setTargetValue(value);
}