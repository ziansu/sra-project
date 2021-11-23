public static org.json.simple.JSONObject composeAck(java.net.InetAddress sourceIP, java.net.InetAddress destIP, java.lang.String message) {
    return networkLayer.JSONservice.composeData(sourceIP, destIP, message, ("" + (NetworkController.TYPE_ACK)));
}