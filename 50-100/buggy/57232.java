public java.lang.Object deserialize(java.io.InputStream input) throws java.io.IOException {
    com.esotericsoftware.kryo.Kryo kryo = pool.borrow();
    com.esotericsoftware.kryo.io.Input in = new com.esotericsoftware.kryo.io.Input(input);
    java.lang.Object result = kryo.readClassAndObject(in);
    in.close();
    pool.release(kryo);
    return result;
}