@java.lang.Override
public <T extends com.sensirion.libble.services.AbstractBleService> T getDeviceService(@android.support.annotation.NonNull
final java.lang.Class<T> type) {
    for (final com.sensirion.libble.services.BleService service : mServices) {
        if (type.getClass().isAssignableFrom(service.getClass())) {
            return ((T) (service));
        }
    }
    return null;
}