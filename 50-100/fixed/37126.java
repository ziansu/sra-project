@java.lang.Override
public void disconnect(java.lang.String vin, java.lang.String type) {
    if (Type.FUNCTION.getCode().equals(type)) {
        thread_Group_function = com.beecloud.mqtt.Utils.Util.stopThreadByVin(vin, thread_Group_function);
    }else
        if (Type.AUTOTEST.getCode().equals(type)) {
            thread_Group_auto = com.beecloud.mqtt.Utils.Util.stopThreadByVin(vin, thread_Group_auto);
        }
    
}