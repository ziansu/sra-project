public void write(com.xqbase.tuna.ConnectionHandler handler, boolean begin) {
    com.xqbase.tuna.util.ByteArrayQueue data = new com.xqbase.tuna.util.ByteArrayQueue();
    write(data, begin);
    handler.send(data.array(), data.offset(), data.length());
}