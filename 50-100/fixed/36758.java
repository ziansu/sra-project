@java.lang.Override
public java.lang.String toString() {
    java.lang.String s = new java.lang.String();
    s += ("ip: " + (this.ip)) + "\n";
    s += ("port: " + (this.port)) + "\n";
    s += "canales:\n";
    for (client.Channel channel : this.channelList.values()) {
        s += ("\t" + (channel.toString())) + "\n";
    }
    return s;
}