@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "power off success");
    updateLightBulb(false);
    _sbPwm.setProgress(0);
    done();
}