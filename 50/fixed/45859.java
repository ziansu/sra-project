@java.lang.Deprecated
public io.netty.handler.codec.mqtt.MqttMessageBuilders.ConnectBuilder password(java.lang.String password) {
    password((password == null ? null : password.getBytes(CharsetUtil.UTF_8)));
    return this;
}