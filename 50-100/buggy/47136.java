@java.lang.Override
public org.kairosdb.core.DataPoint next() {
    if (!(m_dpIterator.hasNext())) {
        long startRange = getStartRange(currentDataPoint.getTimestamp());
        long endRange = getEndRange(currentDataPoint.getTimestamp());
        org.kairosdb.core.aggregator.RangeAggregator.RangeDataPointAggregator.SubRangeIterator subIterator = new org.kairosdb.core.aggregator.RangeAggregator.RangeDataPointAggregator.SubRangeIterator(endRange);
        long dataPointTime = currentDataPoint.getTimestamp();
        if (m_alignStartTime)
            dataPointTime = alignRangeBoundary(dataPointTime);
        
        m_dpIterator = m_subAggregator.getNextDataPoints(dataPointTime, subIterator).iterator();
    }
    return m_dpIterator.next();
}