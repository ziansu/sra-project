public static void internalFailure(java.lang.String msg, java.lang.String filename, java.lang.Throwable ex, wyil.lang.Attribute... attributes) {
    for (wyil.lang.Attribute attr : attributes) {
        if (attr instanceof wyil.attributes.SourceLocation) {
            wyil.attributes.SourceLocation l = ((wyil.attributes.SourceLocation) (attr));
            throw new wyil.util.SyntaxError.InternalFailure(msg, filename, l.start(), l.end(), ex);
        }
    }
    throw new wyil.util.SyntaxError.InternalFailure(msg, filename, 0, (-1), ex);
}