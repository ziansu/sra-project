public boolean hasCachedResultString() {
    return ((specialCachedValue) != null) && ((specialCachedValue.getTypeCode()) == (org.apache.poi.hssf.record.FormulaRecord.SpecialCachedValue.STRING));
}