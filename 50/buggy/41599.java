protected static boolean isSupported(int formatSupport, boolean allowExceedsCapabilities) {
    int maskedSupport = formatSupport & (com.google.android.exoplayer2.RendererCapabilities.FORMAT_SUPPORT_MASK);
    return (maskedSupport == (com.google.android.exoplayer2.RendererCapabilities.FORMAT_HANDLED)) || (allowExceedsCapabilities && (maskedSupport == (com.google.android.exoplayer2.RendererCapabilities.FORMAT_EXCEEDS_CAPABILITIES)));
}