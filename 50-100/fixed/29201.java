@android.support.annotation.NonNull
private com.google.common.base.Optional<li.klass.fhem.domain.core.RoomDeviceList> parseResult(com.google.common.base.Optional<java.lang.String> connectionId, android.content.Context context, java.lang.String result) {
    com.google.common.base.Optional<li.klass.fhem.domain.core.RoomDeviceList> parsed = com.google.common.base.Optional.fromNullable(deviceListParser.parseAndWrapExceptions(result, context));
    com.google.common.base.Optional<li.klass.fhem.domain.core.RoomDeviceList> cached = roomListHolderService.getCachedRoomDeviceListMap(connectionId, context);
    if ((parsed.isPresent()) && (cached.isPresent())) {
        cached.get().addAllDevicesOf(parsed.get(), context);
        return cached;
    }
    return parsed;
}