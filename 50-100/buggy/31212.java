private void writeMono() throws java.io.IOException {
    int channel1 = com.wyozi.jaysound.util.DataConverterUtils.toShort(byteCache[0], byteCache[1]);
    int channel2 = com.wyozi.jaysound.util.DataConverterUtils.toShort(byteCache[2], byteCache[3]);
    int combined = ((int) ((channel1 + channel2) * (com.wyozi.jaysound.util.MonofierOutputStream.gain)));
    out.write((combined & 255));
    out.write(((combined >> 8) & 255));
}