@java.lang.Override
public void connected(swen.adventure.network.Session session) {
    try {
        session.send(new swen.adventure.network.Packet(Packet.Operation.CLIENT_CONNECT, "id:PlayerJohnDoe".getBytes()));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}