private void getGatewayInfo(com.google.gson.JsonObject jobject) {
    sid = jobject.get("sid").getAsString();
    dest_port = jobject.get("port").getAsInt();
    gatewayIP = jobject.get("ip").getAsString();
    org.openhab.binding.xiaomigateway.internal.XiaomiGatewayBinding.logger.info(((((("Discovered Xiaomi Gateway - sid: " + (sid)) + " ip: ") + (gatewayIP)) + " port: ") + (dest_port)));
    setProperlyConfigured(true);
}