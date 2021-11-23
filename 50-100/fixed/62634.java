public void skip(int items) throws java.io.IOException {
    if ((bitsInData) >= items) {
        data <<= items;
        bitsInData -= items;
    }else {
        items -= bitsInData;
        byteStream.skip((items >>> 3));
        items = items & 7;
        if (items != 0) {
            readByte();
            data <<= items;
            bitsInData -= items;
        }
    }
}