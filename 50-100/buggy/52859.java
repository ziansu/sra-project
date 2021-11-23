@java.lang.Override
public void received(java.lang.String data, ch.heigvd.res.cesar.net.Channel channel) {
    int intKey = java.lang.Integer.parseInt(data);
    java.lang.System.out.printf("Received intKey: %x\n", intKey);
    sharedKey = ch.heigvd.res.cesar.net.DH.computeKey(intKey, privateKey, Parameters.P);
    java.lang.System.out.printf("Established shared key: %x\n", sharedKey);
    hasKey = true;
    channel.setProtocol(new ch.heigvd.res.cesar.CesarProtocol(sharedKey));
}