@java.lang.Override
public T apply(final byte[] value) {
    if ((value == null) || ((value.length) == 0)) {
        return null;
    }
    com.esotericsoftware.kryo.io.Input input = new com.esotericsoftware.kryo.io.Input(value);
    return this.kryo.readObject(input, this.type);
}