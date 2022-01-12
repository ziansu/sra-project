public boolean isGreaterThanZero(java.util.List<eu.europa.ec.fisheries.uvms.rules.service.business.MeasureType> values) {
    if (org.apache.commons.collections.CollectionUtils.isEmpty(values)) {
        return false;
    }
    for (eu.europa.ec.fisheries.uvms.rules.service.business.MeasureType type : values) {
        java.math.BigDecimal val = type.getValue();
        if ((val == null) || ((java.math.BigDecimal.ZERO.compareTo(val)) <= 0)) {
            return false;
        }
    }
    return true;
}