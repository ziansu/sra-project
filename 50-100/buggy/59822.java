public static java.lang.String sendCommand(com.gara.voicy.Network net, java.lang.String cmd) {
    java.lang.String ret = "";
    try {
        net.execute(Settings.SERVER_ADDRESS, cmd);
        ret = net.get();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    return ret;
}