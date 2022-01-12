@java.lang.Override
public void connected(ch.heigvd.res.cesar.net.Channel channel) {
    try {
        int intKey = ch.heigvd.res.cesar.net.DH.computeKey(Parameters.G, privateKey, Parameters.P);
        java.lang.System.out.printf("Sending intKey: %x\n", intKey);
        channel.send(java.lang.String.format("%d", intKey));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}