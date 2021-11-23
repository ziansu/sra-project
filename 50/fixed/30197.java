@java.lang.Override
public void write(java.io.DataOutputStream stream) throws java.io.IOException {
    stream.writeByte(((liquid) == null ? -1 : liquid.ordinal()));
    stream.writeByte(((byte) (liquidAmount)));
}