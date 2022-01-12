static short bitReverse(int value) {
    return ((short) (((((net.sf.zipme.DeflaterHuffman.bit4Reverse.charAt((value & 15))) << 12) | ((net.sf.zipme.DeflaterHuffman.bit4Reverse.charAt(((value >> 4) & 15))) << 8)) | ((net.sf.zipme.DeflaterHuffman.bit4Reverse.charAt(((value >> 8) & 15))) << 4)) | (net.sf.zipme.DeflaterHuffman.bit4Reverse.charAt((value >> 12)))));
}