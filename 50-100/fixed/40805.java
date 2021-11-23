public java.util.List<edu.uci.eecs.wukong.common.WuDevice> getTargetDevice(edu.uci.eecs.wukong.common.FlowBasedProcess process) {
    java.util.List<edu.uci.eecs.wukong.common.WuDevice> result = new java.util.ArrayList<edu.uci.eecs.wukong.common.WuDevice>();
    for (edu.uci.eecs.wukong.common.WuDevice device : devices.values()) {
        if (process.isTarget(device)) {
            result.add(device);
        }
    }
    return result;
}