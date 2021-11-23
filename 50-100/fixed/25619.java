@java.lang.Override
public void send(java.io.DataOutputStream dos) throws java.lang.Exception {
    dos.writeLong(c.getID());
    dos.writeInt(c.list.size());
    for (int i = 0; i < (c.list.size()); i++) {
        java.awt.Point p = c.list.get(i);
        dos.writeInt(p.x);
        dos.writeInt(p.y);
    }
}