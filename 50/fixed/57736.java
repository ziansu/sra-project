public void writeUnsignedInt(long v) {
    com.alesharik.webserver.api.qt.QDataStream.U.putInt(allocFor(4), com.alesharik.webserver.api.ByteOrderUtils.format(((int) (v)), order));
}