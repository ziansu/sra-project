@java.lang.Override
public void write(com.mindlin.jsast.tree.CompilationUnitTree tree, java.io.Writer output) throws java.io.IOException {
    try {
        tree.accept(this, new com.mindlin.jsast.impl.writer.JSWriterImpl.WriterHelper(output));
    } catch (java.lang.RuntimeException e) {
        throw ((java.io.IOException) (e.getCause()));
    }
}