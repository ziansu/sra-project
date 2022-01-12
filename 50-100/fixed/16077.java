@java.lang.Override
public void deserialize(io.netty.buffer.ByteBuf buf, org.apache.tajo.storage.Tuple output) throws java.io.IOException, org.apache.tajo.storage.text.TextLineParsingError {
    super.deserialize(buf, tuple);
    for (int i = 0; i < (actualTargetColumns.length); i++) {
        output.put(actualTargetColumns[i], org.apache.tajo.storage.text.ApacheLogLineSerDe.ApacheLogDeserializer.getField(tuple, actualTargetColumns[i]));
    }
}