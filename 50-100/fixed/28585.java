@java.lang.Override
public boolean execute() {
    _ble.powerOff(_address, new nl.dobots.bluenet.ble.base.callbacks.IStatusCallback() {
        @java.lang.Override
        public void onSuccess() {
            android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "power off success");
            _sbPwm.setProgress(0);
            done();
        }

        @java.lang.Override
        public void onError(int error) {
            android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, ("power off failed: " + error));
            done();
        }
    });
    return true;
}