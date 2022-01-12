public void safeAddProduct(java.lang.String product) throws java.lang.Exception {
    this.lock = channel.lock();
    this.file.seek(this.file.length());
    this.file.writeBytes((product + '\n'));
    lock.release();
    close();
}