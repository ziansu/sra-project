private java.lang.String serializeTable(com.rptools.table.RPTable table) {
    try {
        return com.google.protobuf.util.JsonFormat.printer().print(table);
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        log.error(("Exception serializing RPTable object " + (table.getName())), e);
        return "";
    }
}