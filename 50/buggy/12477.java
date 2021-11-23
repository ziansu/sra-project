@java.lang.Override
public void connect() throws java.io.IOException {
    if (getDevices().isEmpty())
        br.com.criativasoft.opendevice.core.BaseDeviceManager.log.warn((("No devices registed ! (TIP: Create " + (this.getClass().getSimpleName())) + " instance before devices or call addDevice !"));
    
    connectAll();
}