@java.lang.Override
public java.lang.String toString() {
    java.lang.String msg = (((((("IPTABLE " + (this.messageID)) + " ") + (ipAddress)) + " ") + (port)) + " ") + (ipTable);
    java.lang.String length = java.lang.String.format("%04d", ((msg.length()) + 5));
    return (length + " ") + msg;
}