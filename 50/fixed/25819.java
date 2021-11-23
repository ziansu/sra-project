private java.util.List<br.com.criativasoft.opendevice.core.model.Device> getCurrentDevices() {
    return deviceMap.get(br.com.criativasoft.opendevice.core.TenantProvider.getCurrentID());
}