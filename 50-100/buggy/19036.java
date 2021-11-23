@java.lang.Override
public void encodeValueInto(int depth, com.facebook.presto.spi.block.Block block, int position, io.airlift.slice.SliceOutput output) {
    try {
        long millis = type.getLong(block, position);
        buffer.setLength(0);
        dateTimeFormatter.printTo(buffer, millis);
        for (int index = 0; index < (buffer.length()); index++) {
            output.writeByte(buffer.charAt(index));
        }
    } catch (java.io.IOException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
}