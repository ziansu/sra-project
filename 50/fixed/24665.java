@java.lang.Override
public rx.Observable<byte[]> call(java.lang.Boolean notificationDescriptorData) {
    return observeOnCharacteristicChangeCallbacks(id);
}