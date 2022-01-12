private void populateSizeBits() {
    int size = getFileSize();
    sbits = new java.util.ArrayList<java.lang.Integer>(32);
    boolean[] bits = FileReader.toBinary(size, 32);
    for (int bit = 0; bit < 32; bit++) {
        if ((bits[bit]) == true)
            sbits.add(1);
        else {
            sbits.add(0);
        }
    }
    sBitsIt = sbits.iterator();
}