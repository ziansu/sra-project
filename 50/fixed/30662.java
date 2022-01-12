@java.lang.Override
public void run() {
    try {
        setup();
        this.run();
        end();
    } catch (java.net.SocketException e) {
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}