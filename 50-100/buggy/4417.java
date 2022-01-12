public static java.lang.String getSubstring(java.lang.String message) {
    int length = java.lang.Math.min(message.length(), com.yumcouver.tunnel.client.util.Wireshark.DEBUG_MESSAGE_LENGTH);
    int index = message.indexOf("\n");
    if (index == (-1))
        return message.substring(length);
    else
        return message.substring(java.lang.Math.min(index, length));
    
}