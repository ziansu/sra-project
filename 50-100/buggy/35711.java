static java.lang.String toBinaryString(int v, int bits, int uBit) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < bits; i++) {
        if ((i > 0) && ((i % uBit) == 0))
            sb.append('_');
        
        sb.append(((v & (1 << i)) > 0 ? '1' : '0'));
    }
    return sb.toString();
}