public void setRowIndex(java.lang.Integer rowIndex) {
    if (((rowIndex == null) || (rowIndex < 0)) || (rowIndex > 999999))
        this.rowNumber = DashboardUtils.INT_MISSING_VALUE;
    else
        this.rowNumber = new java.lang.Integer(((rowIndex.intValue()) + 1));
    
}