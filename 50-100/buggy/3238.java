private void validate(java.lang.String funcName, org.apache.kylin.metadata.datatype.DataType dataType) {
    if ((org.apache.kylin.measure.hllc.HLLCMeasureType.FUNC_COUNT_DISTINCT.equals(funcName)) == false)
        throw new java.lang.IllegalArgumentException();
    
    if ((org.apache.kylin.measure.hllc.HLLCMeasureType.DATATYPE_HLLC.equals(dataType.getName())) == false)
        throw new java.lang.IllegalArgumentException();
    
    if (((dataType.getPrecision()) < 1) || ((dataType.getPrecision()) > 5000))
        throw new java.lang.IllegalArgumentException();
    
}