@java.lang.Override
public void onCommonResponded(cn.bit.hao.ble.tool.response.events.CommonResponseEvent commonResponseEvent) {
    if (commonResponseEvent instanceof cn.bit.hao.ble.tool.response.events.bluetooth.BluetoothGattEvent) {
        java.lang.String macAddress = ((cn.bit.hao.ble.tool.response.events.bluetooth.BluetoothGattEvent) (commonResponseEvent)).getMacAddress();
        switch (((cn.bit.hao.ble.tool.response.events.bluetooth.BluetoothGattEvent) (commonResponseEvent)).getEventCode()) {
            case GATT_CONNECTED :
                break;
            default :
                break;
        }
    }
}