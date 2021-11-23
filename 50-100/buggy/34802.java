@java.lang.Override
public int readInt() {
    attempt(4);
    if ((remainingData()) >= 4) {
        return buffer.getShort();
    }else {
        return ((readShort()) << 16) & (readShort());
    }
}