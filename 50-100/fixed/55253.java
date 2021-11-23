@java.lang.Override
public void decode(java.io.DataInputStream dis) throws java.io.IOException {
    tank.id = dis.readInt();
    messageType = dis.readInt();
    tank.x = dis.readInt();
    tank.y = dis.readInt();
    tank.life = dis.readInt();
    tank.role = dis.readBoolean();
}