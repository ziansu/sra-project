@java.lang.Override
public void encode(java.io.DataOutputStream dos) throws java.io.IOException {
    dos.writeInt(tank.id);
    dos.writeInt(messageType);
    dos.writeInt(tank.x);
    dos.writeInt(tank.y);
    dos.writeInt(tank.life);
    dos.writeBoolean(tank.role);
}