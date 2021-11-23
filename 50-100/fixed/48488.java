@java.lang.Override
public char[] sourceFileName() {
    try (org.eclipse.jdt.internal.core.nd.IReader rl = this.typeRef.lock()) {
        org.eclipse.jdt.internal.core.nd.java.NdType type = this.typeRef.get();
        if (type != null) {
            char[] result = type.getSourceFileName().getChars();
            if ((result.length) == 0) {
                return null;
            }
            return result;
        }else {
            return null;
        }
    }
}