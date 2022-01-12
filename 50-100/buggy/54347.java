private java.lang.Object[] changeNullValueToNullString(java.lang.Object[] rowValue) {
    int i = 0;
    for (java.lang.Object obj : rowValue) {
        if (obj != null) {
            if (obj.equals(valueToCheckAgainst)) {
                rowValue[i] = org.carbondata.core.constants.CarbonCommonConstants.MEMBER_DEFAULT_VAL;
            }
        }else
            if (i > (meta.memberMapping.length)) {
                return rowValue;
            }else {
                rowValue[i] = org.carbondata.core.constants.CarbonCommonConstants.MEMBER_DEFAULT_VAL;
            }
        
        i++;
    }
    return rowValue;
}