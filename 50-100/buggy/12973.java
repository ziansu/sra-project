public boolean writeData(byte[] data, int length) {
    int written = 0;
    for (int i = 0; i < (java.lang.Math.min(length, data.length)); i++) {
        if ((writeBitsRaw(org.q3df.demo.Q3HuffmanCoder.huff_paths[(255 & (data[i]))], org.q3df.demo.Q3HuffmanCoder.sym_size[(255 & (data[i]))])) > 0) {
            written++;
        }else
            break;
        
    }
    return written == length;
}