protected void writeMobileNetworkCode(final java.lang.Integer mobileNetworkCode, final com.google.gson.JsonObject object) {
    if (mobileNetworkCode != null) {
        object.addProperty("mobile_network_code", mobileNetworkCode);
    }else {
        object.add("mobile_network_code", com.google.gson.JsonNull.INSTANCE);
    }
}