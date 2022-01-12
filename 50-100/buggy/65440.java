@java.lang.Override
public void run() {
    controller.addClient(new net.ddns.akd.wincleaner.model.Client(Connections.handler.get(("" + (other.getInetAddress())))));
    Connections.handler.put(("" + (other.getInetAddress())), new net.ddns.akd.wincleaner.network.ConnectionHandler(other));
    Connections.handler.get(("" + (other.getInetAddress()))).startIncome(controller.getMainApp());
}