public double getMsg1UniqueMsgIdVariance() {
    return (((double) (m_sumOfMsg1UniqueMsgIdCountSquare)) / ((double) (m_numberOfIntervals))) - (-(((double) (getMsg1UniqueMsgIdMean())) * ((double) (getMsg1UniqueMsgIdMean()))));
}