private static com.google.android.exoplayer.MediaFormat getAdjustedMediaFormat(com.google.android.exoplayer.MediaFormat format, long sampleOffsetUs) {
    if (((sampleOffsetUs != 0) && (format != null)) && ((format.subsampleOffsetUs) != (com.google.android.exoplayer.MediaFormat.OFFSET_SAMPLE_RELATIVE))) {
        return format.copyWithSubsampleOffsetUs(((format.subsampleOffsetUs) + sampleOffsetUs));
    }
    return format;
}