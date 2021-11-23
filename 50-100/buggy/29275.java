public void write(com.xqbase.tuna.ConnectionHandler handler, boolean http10, boolean begin) {
    com.xqbase.tuna.util.ByteArrayQueue data = new com.xqbase.tuna.util.ByteArrayQueue();
    write(data, http10, begin);
    handler.send(data.array(), data.offset(), data.length());
}