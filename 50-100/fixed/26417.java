protected boolean checkVectorCapacityReached() {
    if (((bytesReadInCurrentPass) + (dataTypeLengthInBits)) > (capacity())) {
        org.apache.drill.exec.store.parquet.columnreaders.ColumnReader.logger.debug("Reached the capacity of the data vector in a variable length value vector.");
        return true;
    }
    return (valuesReadInCurrentPass) > (valueVec.getValueCapacity());
}