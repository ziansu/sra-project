public static org.echocat.gradle.plugins.golang.model.OperatingSystem resolveForJava(java.lang.String javaArchName) throws java.lang.IllegalArgumentException {
    if (javaArchName != null) {
        final java.lang.String asLower = javaArchName.toLowerCase(java.util.Locale.US).trim();
        for (final org.echocat.gradle.plugins.golang.model.OperatingSystem candidate : org.echocat.gradle.plugins.golang.model.OperatingSystem.values()) {
            if (((candidate._nameInJava) != null) && (asLower.startsWith(candidate._nameInJava))) {
                return candidate;
            }
        }
    }
    throw new java.lang.IllegalArgumentException(("Illegal Java operating system: " + javaArchName));
}