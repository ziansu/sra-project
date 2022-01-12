public static void checkOffsetAndCount(final char[] buffer, final int charOffset, final int charCount) {
    com.google.gwt.core.shared.impl.InternalPreconditions.checkNotNull(buffer);
    java.io.IOUtils.checkOffsetAndCount(buffer.length, charOffset, charCount);
}