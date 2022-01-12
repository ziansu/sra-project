public static java.util.Map<java.lang.String, java.util.List<com.heaven7.java.data.mediator.FieldData>> groupFieldByInterface(java.util.List<com.heaven7.java.data.mediator.FieldData> mFields) {
    java.util.HashMap<java.lang.String, java.util.List<com.heaven7.java.data.mediator.FieldData>> map = new java.util.HashMap<>();
    final java.util.Collection<com.heaven7.java.data.mediator.TypeInterfaceFiller> values = com.heaven7.java.data.mediator.processor.Util.sFillerMap.values();
    for (com.heaven7.java.data.mediator.FieldData fd : mFields) {
        for (com.heaven7.java.data.mediator.TypeInterfaceFiller filler : values) {
            filler.fill(fd, map);
        }
    }
    return map;
}