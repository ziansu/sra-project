@java.lang.Override
public void addData(java.lang.String val) {
    java.lang.String fval = org.apache.commons.lang.StringUtils.trimToEmpty(val);
    if (!(isMissingVal(fval))) {
        double dval = 0;
        try {
            dval = java.lang.Double.parseDouble(fval);
        } catch (java.lang.NumberFormatException e) {
            super.incInvalidValCnt();
            return ;
        }
        process(dval, 1);
    }else {
        super.incMissingValCnt();
    }
}