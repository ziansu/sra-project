private int readLongType() {
    (this.byteCurrently)++;
    int type = (0 << 7) + ((this.bytes[this.byteCurrently]) & 127);
    if ((((this.bytes[this.byteCurrently]) >> 7) & 1) == 1) {
        type = (type << 7) + (readLongType());
        return type;
    }
    return (this.bytes[this.byteCurrently]) & 127;
}