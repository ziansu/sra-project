private void flushbuf() throws java.io.IOException {
    if (bufdirty) {
        if ((super.getFilePointer()) != (bufstartpos)) {
            super.seek(bufstartpos);
        }
        super.write(buf, 0, bufusedsize);
        bufdirty = false;
    }
}