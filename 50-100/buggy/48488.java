@java.lang.Override
public char[] sourceFileName() {
    try (org.eclipse.jdt.internal.core.nd.IReader rl = this.typeRef.lock()) {
        org.eclipse.jdt.internal.core.nd.java.NdType type = this.typeRef.get();
        if (type != null) {
            return type.getSourceFileName().getChars();
        }else {
            return new char[0];
        }
    }
}