@java.lang.Override
public boolean execute() {
    _ble.powerOn(_address, new nl.dobots.bluenet.ble.base.callbacks.IStatusCallback() {
        @java.lang.Override
        public void onSuccess() {
            android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "power on success");
            _sbPwm.setProgress(100);
            done();
        }

        @java.lang.Override
        public void onError(int error) {
            android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, ("power on failed: " + error));
            done();
        }
    });
    return true;
}