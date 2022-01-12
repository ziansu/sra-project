public static org.zkoss.zss.model.impl.CellImpl fromBytes(byte[] inByteArray) {
    org.zkoss.zss.model.impl.CellImpl cellImpl;
    com.esotericsoftware.kryo.Kryo kryo = org.zkoss.zss.model.impl.CellImpl.kryoPool.borrow();
    try (com.esotericsoftware.kryo.io.Input in = new com.esotericsoftware.kryo.io.Input(inByteArray)) {
        cellImpl = kryo.readObject(in, org.zkoss.zss.model.impl.CellImpl.class);
        in.close();
    } catch (java.lang.Exception e) {
        cellImpl = new org.zkoss.zss.model.impl.CellImpl();
    }
    org.zkoss.zss.model.impl.CellImpl.kryoPool.release(kryo);
    return cellImpl;
}