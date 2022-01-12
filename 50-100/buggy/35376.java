@java.lang.Override
public org.opendaylight.ovsdb.lib.notation.Column<org.opendaylight.ovsdb.lib.schema.GenericTableSchema, java.util.Set<java.lang.Integer>> getOpenFlowPortColumn() {
    java.util.Set<java.lang.Integer> portSet = openFlowPort;
    if (portSet != null) {
        if (portSet.contains(java.lang.Integer.valueOf(0))) {
            portSet = null;
        }
        return new org.opendaylight.ovsdb.lib.notation.Column<org.opendaylight.ovsdb.lib.schema.GenericTableSchema, java.util.Set<java.lang.Integer>>(null, portSet);
    }
    return null;
}