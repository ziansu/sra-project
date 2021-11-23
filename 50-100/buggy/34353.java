@java.lang.Override
protected boolean checkCombination(java.lang.Class<? extends org.eclipse.wst.xml.xpath2.processor.internal.types.AnyType> newType) {
    java.lang.Class<? extends org.eclipse.wst.xml.xpath2.processor.internal.types.AnyType> targetType = getTargetType();
    if ((targetType == (org.eclipse.wst.xml.xpath2.processor.internal.types.XSDayTimeDuration.class)) || (targetType == (org.eclipse.wst.xml.xpath2.processor.internal.types.XSYearMonthDuration.class))) {
        return targetType == newType;
    }
    return super.checkCombination(newType);
}