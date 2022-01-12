public void writeDouble(double value) {
    long longBits = java.lang.Double.doubleToLongBits(value);
    writeInt(((int) (longBits >>> 32)));
    writeInt(((int) (longBits)));
    position += 8;
}