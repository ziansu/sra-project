@java.lang.Override
public void close() {
    if ((previousInlineContext) != null) {
        for (int inlineDepth = 0; inlineDepth < (previousInlineContext.size()); inlineDepth++) {
            closeScope(inlineDepth);
        }
    }
    if ((printer) != null) {
        printer.close();
        printer = null;
    }
}