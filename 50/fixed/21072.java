public static java.lang.Float getRtStart(@javax.annotation.Nonnull
io.github.msdk.datamodel.chromatograms.Chromatogram chromatogram) {
    chromatogram.getDataPoints(io.github.msdk.util.ChromatogramUtil.dataPointList);
    com.google.common.collect.Range<io.github.msdk.datamodel.rawdata.ChromatographyInfo> rtRange = io.github.msdk.util.ChromatogramUtil.dataPointList.getRtRange();
    if (rtRange != null)
        return rtRange.lowerEndpoint().getRetentionTime();
    
    return null;
}