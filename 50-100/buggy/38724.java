public void encode(java.io.DataOutputStream dos) throws java.io.IOException {
    dos.writeInt(tank.id);
    dos.writeInt(messageType);
    dos.writeInt(tank.x);
    dos.writeInt(tank.y);
    dos.writeInt(tank.xDir);
    dos.writeInt(tank.yDir);
    dos.writeInt(tank.life);
    dos.writeInt(tank.xBarrelDirection);
    dos.writeInt(tank.yBarrelDirection);
    dos.writeBoolean(tank.role);
    dos.writeBoolean(tank.isLive);
}