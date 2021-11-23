@java.lang.Override
public void update(long t) {
    while (isOpened()) {
        try {
            me.drton.jmavlib.mavlink.MAVLinkMessage msg = stream.read();
            if (msg == null) {
                break;
            }
            sendMessage(msg);
        } catch (java.io.IOException e) {
            return ;
        }
    } 
}