@java.lang.Override
public long fileLength(java.lang.String name) throws java.io.IOException {
    org.apache.lucene.store.IndexInput input = nested.openInput(name, 8);
    long length = 0;
    if ((input.length()) >= 8)
        length = input.readLong();
    
    input.close();
    if (length == (-1)) {
        org.apache.lucene.store.IndexInput in = openInput(name);
        length = in.length();
        in.close();
    }
    return length;
}