@java.lang.Override
public void run() {
    org.dsa.iot.dslink.node.value.Value value = node.getValue();
    if (value == null) {
        value = new org.dsa.iot.dslink.node.value.Value(0);
    }else {
        value = new org.dsa.iot.dslink.node.value.Value(((value.getNumber().intValue()) + 1));
    }
    node.setValue(value);
    java.lang.System.out.println(("New incremental value: " + (value.getNumber())));
}