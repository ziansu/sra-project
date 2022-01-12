private java.lang.String readLongType() {
    (this.byteCurrently)++;
    java.lang.String type = "" + ((this.bytes[this.byteCurrently]) & 127);
    if ((((this.bytes[this.byteCurrently]) >> 7) & 1) == 1) {
        type += readLongType();
        return type;
    }
    return "" + ((this.bytes[this.byteCurrently]) & 127);
}