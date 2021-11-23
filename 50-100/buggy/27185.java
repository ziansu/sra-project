@java.lang.Override
public void run() {
    while ((!(cancelled)) || ((queue.size()) > 0)) {
        try {
            final java.net.DatagramPacket packet = queue.take();
            writer.writePacket(packet);
        } catch (final java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}