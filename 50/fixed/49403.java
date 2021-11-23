public int getLimit() {
    if ((overlookOuterLimit) || ((org.apache.kylin.common.debug.BackdoorToggles.getStatementMaxRows()) == null)) {
        return limit;
    }else {
        return java.lang.Math.min(limit, org.apache.kylin.common.debug.BackdoorToggles.getStatementMaxRows());
    }
}