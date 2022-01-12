private java.util.List<org.hisp.dhis.dataelement.DataElementOperand> getOperands(org.hisp.dhis.dataelement.DataElement dataElement, org.hisp.dhis.dataelement.DataElementCategoryCombo categoryCombo, boolean includeTotals) {
    java.util.List<org.hisp.dhis.dataelement.DataElementOperand> operands = com.google.common.collect.Lists.newArrayList();
    if ((!(categoryCombo.isDefault())) && includeTotals) {
        org.hisp.dhis.dataelement.DataElementOperand operand = new org.hisp.dhis.dataelement.DataElementOperand(dataElement);
        operands.add(operand);
    }
    for (org.hisp.dhis.dataelement.DataElementCategoryOptionCombo categoryOptionCombo : categoryCombo.getSortedOptionCombos()) {
        org.hisp.dhis.dataelement.DataElementOperand operand = new org.hisp.dhis.dataelement.DataElementOperand(dataElement, categoryOptionCombo);
        operands.add(operand);
    }
    return operands;
}