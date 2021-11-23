public synchronized gondes.dev.club.common.io.Buffer append(java.lang.Character value) {
    short v = ((short) (value.charValue()));
    return this.append(((byte) ((v >>> 8) & 255))).append(((byte) (v & 255)));
}