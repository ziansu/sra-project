private org.openhab.binding.zwave.handler.ZWaveThingChannel createChannel(java.lang.String type) {
    java.util.Map<java.lang.String, java.lang.String> args = new java.util.HashMap<java.lang.String, java.lang.String>();
    args.put("type", type);
    return new org.openhab.binding.zwave.handler.ZWaveThingChannel(null, uid, org.openhab.binding.zwave.handler.ZWaveThingChannel.DataType.DecimalType, CommandClass.METER_TBL_MONITOR.toString(), 0, args);
}