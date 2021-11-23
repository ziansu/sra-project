@java.lang.Override
public org.opendaylight.ovsdb.lib.notation.Column<org.opendaylight.ovsdb.lib.schema.GenericTableSchema, java.util.Set<java.lang.Long>> getOpenFlowPortColumn() {
    java.util.Set<java.lang.Long> portSet = openFlowPort;
    if (portSet != null) {
        if (portSet.contains(java.lang.Long.valueOf(0))) {
            portSet = null;
        }
        return new org.opendaylight.ovsdb.lib.notation.Column<org.opendaylight.ovsdb.lib.schema.GenericTableSchema, java.util.Set<java.lang.Long>>(null, portSet);
    }
    return null;
}