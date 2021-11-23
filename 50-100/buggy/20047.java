private void flushbuf() throws java.io.IOException {
    if (this.bufdirty) {
        if ((super.getFilePointer()) != (this.bufstartpos)) {
            super.seek(this.bufstartpos);
        }
        super.write(this.buf, 0, this.bufusedsize);
        this.bufdirty = false;
    }
}