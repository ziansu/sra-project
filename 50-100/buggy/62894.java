public int containsCount(int listId, long member) {
    java.nio.ByteBuffer buff = data[listId];
    buff.flip();
    int found = 0;
    while (buff.hasRemaining()) {
        if (member == (com.ociweb.pronghorn.util.VarLenLong.readLongSigned(buff))) {
            found++;
        }
    } 
    buff.limit(buff.capacity());
    return found;
}