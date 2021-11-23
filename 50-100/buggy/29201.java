@android.support.annotation.NonNull
private com.google.common.base.Optional<li.klass.fhem.domain.core.RoomDeviceList> parseResult(com.google.common.base.Optional<java.lang.String> connectionId, android.content.Context context, java.lang.String result) {
    com.google.common.base.Optional<li.klass.fhem.domain.core.RoomDeviceList> parsed = com.google.common.base.Optional.fromNullable(deviceListParser.parseAndWrapExceptions(result, context));
    li.klass.fhem.domain.core.RoomDeviceList cached = roomListHolderService.getCachedRoomDeviceListMap(connectionId, context);
    if (parsed.isPresent()) {
        cached.addAllDevicesOf(parsed.get(), context);
    }
    return com.google.common.base.Optional.of(cached);
}