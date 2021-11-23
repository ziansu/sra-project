public void serialize(java.io.OutputStream output, java.lang.Object object) throws java.io.IOException {
    com.esotericsoftware.kryo.Kryo kryo = pool.borrow();
    com.esotericsoftware.kryo.io.Output out = new com.esotericsoftware.kryo.io.Output(output);
    kryo.writeClassAndObject(out, object);
    out.close();
    output.close();
    pool.release(kryo);
}