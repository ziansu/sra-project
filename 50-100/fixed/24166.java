@java.lang.Override
public void run() {
    if ((exit) == false) {
        if ((((periodCount)++) % 4) == 0) {
            query(com.vehicle.uart.DevMaster.CMD_ID_GENERAL_LONG, com.vehicle.uart.DevMaster.DEVICE_TYPE_BIKE);
        }else {
            query(com.vehicle.uart.DevMaster.CMD_ID_GENERAL_SHORT, com.vehicle.uart.DevMaster.DEVICE_TYPE_BIKE);
        }
        broadcastUpdate(com.vehicle.uart.DevMaster.ACTION_PACKAGE_PUSHED);
        mHandler.postDelayed(regularQueryProcess, com.vehicle.uart.DevMaster.SHORT_PERIOD);
    }
}