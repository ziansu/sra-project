public java.util.List<edu.uci.eecs.wukong.common.WuDevice> getTargetDevice(edu.uci.eecs.wukong.common.FlowBasedProcess process) {
    java.util.List<edu.uci.eecs.wukong.common.WuDevice> devices = new java.util.ArrayList<edu.uci.eecs.wukong.common.WuDevice>();
    for (edu.uci.eecs.wukong.common.WuDevice device : devices) {
        if (process.isTarget(device)) {
            devices.add(device);
        }
    }
    return devices;
}