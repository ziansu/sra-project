@java.lang.Override
public java.lang.Void visitBluetoothWaitForConnectionAction(de.fhg.iais.roberta.syntax.action.ev3.BluetoothWaitForConnectionAction<java.lang.Void> bluetoothWaitForConnection) {
    this.sb.append("int connection = ;");
    this.sb.append("BTCheck(connection);");
    return null;
}