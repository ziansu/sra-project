@java.lang.Override
public void send(java.io.DataOutputStream dos) throws java.lang.Exception {
    dos.writeLong(c.getID());
    dos.writeInt(c.list.size());
    for (java.awt.Point p : c.list) {
        dos.writeInt(p.x);
        dos.writeInt(p.y);
    }
}