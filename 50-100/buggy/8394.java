public double getMsg1UniqueMsgIdVariance() {
    final double variance = (((double) (m_sumOfMsg1UniqueMsgIdCountSquare)) / ((double) (m_numberOfIntervals))) - (-((getMsg1UniqueMsgIdMean()) * (getMsg1UniqueMsgIdMean())));
    return variance;
    return (((double) (m_sumOfMsg1UniqueMsgIdCountSquare)) / ((double) (m_numberOfIntervals))) - (-(((double) (getMsg1UniqueMsgIdMean())) * ((double) (getMsg1UniqueMsgIdMean()))));
}