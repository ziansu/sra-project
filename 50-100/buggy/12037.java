public void writeTo(final java.io.OutputStream outStream) throws java.io.IOException {
    if (((progressHandler) != null) || ((cancellationHandler) != null)) {
        writeWithNotify(outStream);
    }else {
        outStream.write(this.b, this.off, this.len);
    }
    outStream.flush();
}