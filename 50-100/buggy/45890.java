@java.lang.Override
public boolean execute() {
    _ble.relayOn(_address, new nl.dobots.bluenet.ble.base.callbacks.IStatusCallback() {
        @java.lang.Override
        public void onSuccess() {
            android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "relay on success");
            updateLightBulb(true);
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