@java.lang.Override
public void execute(de.chrthms.hmatic4j.base.impl.AbstractConnectionImpl connection) throws de.chrthms.hmatic4j.base.exceptions.HMExecutionException, de.chrthms.hmatic4j.base.exceptions.HMUnsupportedException {
    if (connection.isWireless()) {
        de.chrthms.hmatic4j.base.impl.HMWirelessConnectionImpl wirelessConnection = connection.castToWirelessImpl();
        connection.execute(getMethodName(), de.chrthms.hmatic4j.base.commands.impl.set.value.AbstractSetValue.concatAddressWithChannel(), getValueKey(), getValue(), wirelessConnection.getRxMode().toString());
    }else {
        connection.execute(getMethodName(), de.chrthms.hmatic4j.base.commands.impl.set.value.AbstractSetValue.concatAddressWithChannel(), getValueKey(), getValue());
    }
}