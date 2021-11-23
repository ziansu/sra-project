private void writeAndFlushValue(java.io.OutputStream ops, java.lang.Object value) throws java.io.IOException {
    mapper.writeValue(new com.googlecode.jsonrpc4j.NoCloseOutputStream(ops), value);
    ops.write('\n');
    ops.flush();
}