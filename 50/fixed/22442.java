public <W extends java.lang.Appendable & Closeable> void copy(OutputSupplier<W> to) {
    CharStreams.copy(newReaderSupplier(), to);
}