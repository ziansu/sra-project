@java.lang.Override
public T apply(final byte[] value) {
    if ((value == null) || ((value.length) == 0)) {
        return null;
    }
    com.esotericsoftware.kryo.io.Input input = new com.esotericsoftware.kryo.io.Input(new java.io.ByteArrayInputStream(value), org.komea.event.utils.kryo.impl.KryoByteArrayToObjectConverter.DEFAULT_SIZE);
    return this.kryo.readObject(input, this.type);
}