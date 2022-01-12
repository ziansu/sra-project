@java.lang.Override
public boolean execute() {
    _ble.writePwm(_address, pwm, new nl.dobots.bluenet.ble.base.callbacks.IStatusCallback() {
        @java.lang.Override
        public void onSuccess() {
            android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "set pwm success");
            done();
        }

        @java.lang.Override
        public void onError(int error) {
            android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, ("set pwm failed: " + error));
            done();
        }
    });
    return true;
}