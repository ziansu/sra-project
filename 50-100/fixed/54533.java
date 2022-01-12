public ij.process.ImageProcessor get(final java.lang.String url, final int downSampleLevels, final boolean isMask, final boolean convertTo16Bit) throws java.lang.IllegalArgumentException {
    final org.janelia.alignment.util.ImageProcessorCache.CacheKey key = new org.janelia.alignment.util.ImageProcessorCache.CacheKey(url, downSampleLevels, isMask, convertTo16Bit);
    final ij.process.ImageProcessor imageProcessor;
    try {
        imageProcessor = cache.get(key);
    } catch (final java.lang.Throwable t) {
        throw new java.lang.IllegalArgumentException((("failed to retrieve " + key) + " from cache"), t);
    }
    return imageProcessor.duplicate();
}