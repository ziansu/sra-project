private void disableRead() {
    intrestingOps &= ~(java.nio.channels.SelectionKey.OP_READ);
}