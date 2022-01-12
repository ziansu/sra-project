private java.lang.String readIndefinateLength() {
    (this.byteCurrently)++;
    java.lang.String type = "" + ((this.bytes[this.byteCurrently]) & 127);
    if ((((this.bytes[this.byteCurrently]) >> 7) & 1) == 1) {
        type += readLongType();
    }
    return "" + ((this.bytes[this.byteCurrently]) & 127);
}