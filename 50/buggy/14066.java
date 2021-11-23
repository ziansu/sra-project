public static boolean removeBond(java.lang.Class btClass, android.bluetooth.BluetoothDevice btDevice) throws java.lang.Exception {
    java.lang.reflect.Method removeBondMethod = btClass.getMethod("removeBond");
    java.lang.Boolean returnValue = ((java.lang.Boolean) (removeBondMethod.invoke(btDevice)));
    return returnValue.booleanValue();
}