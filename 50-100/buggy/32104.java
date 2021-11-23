public void setDateConstraint(int dateType, java.lang.String date) {
    if (((com.jensen.draculadaybyday.sql_lite.DateConstraint.BEFORE) <= dateType) && (dateType <= (com.jensen.draculadaybyday.sql_lite.DateConstraint.EXACT))) {
        this.dateType = dateType;
        switch (dateType) {
            case com.jensen.draculadaybyday.sql_lite.DateConstraint.BEFORE :
                setConstraintSqlText(com.jensen.draculadaybyday.sql_lite.DateConstraint.BEFORE_DATE);
                break;
            case com.jensen.draculadaybyday.sql_lite.DateConstraint.AFTER :
                setConstraintSqlText(com.jensen.draculadaybyday.sql_lite.DateConstraint.AFTER_DATE);
                break;
            case com.jensen.draculadaybyday.sql_lite.DateConstraint.EXACT :
                setConstraintSqlText(com.jensen.draculadaybyday.sql_lite.DateConstraint.EXACT_DATE);
                break;
        }
    }
    addConstraintSqlValue(date);
}