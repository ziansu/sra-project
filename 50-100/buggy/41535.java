public void updateValueData(org.dsa.iot.dslink.util.json.JsonArray valueArray) {
    org.dsa.iot.dslink.node.value.Value val = org.dsa.iot.dslink.node.value.ValueUtils.toValue(valueArray.get(0), ((java.lang.String) (valueArray.get(1))));
    if (val.getType().getRawName().equals(node.getValueType().getRawName())) {
        node.setValueType(val.getType());
    }
    node.setValue(val);
}