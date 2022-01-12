@java.lang.Override
public void run() {
    while ((!(cancelled)) || ((queue.size()) > 0)) {
        try {
            final java.net.DatagramPacket packet = queue.take();
            writer.writePacket(packet);
        } catch (final java.lang.InterruptedException e) {
            while ((queue.size()) > 0) {
                final java.net.DatagramPacket packet = queue.remove();
                writer.writePacket(packet);
                cancelled = true;
            } 
        }
    } 
}