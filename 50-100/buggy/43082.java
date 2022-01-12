private void createMappings() {
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Class> entry : peripheralToIface.entrySet()) {
        ifaceToPeripheral.put(entry.getValue(), entry.getKey());
    }
    for (java.lang.Integer peripheral : usedPeripherals) {
        if ((peripheral >= (DPA_ProtocolProperties.PNUM_Properties.USER_PERIPHERAL_START)) && (peripheral <= (DPA_ProtocolProperties.PNUM_Properties.USER_PERIPHERAL_END))) {
            peripheralToIface.put(peripheral, com.microrisc.simply.iqrf.dpa.v220.devices.MyCustom.class);
        }
    }
}