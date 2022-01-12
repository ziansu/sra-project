public java.lang.Object fetchData() throws java.util.NoSuchElementException, paintcomponents.NoConnectingLineSegmentException, paintcomponents.data.DataFromPointNoDataProviderException, paintcomponents.data.DataFromPointProviderCannotProvideDataException {
    if ((this.lineSegment) == null)
        throw new paintcomponents.NoConnectingLineSegmentException();
    
    java.lang.Object returnVal = lineSegment.getFromPoint().getData().toString();
    if (returnVal == null)
        throw new java.util.NoSuchElementException();
    
    return returnVal;
}