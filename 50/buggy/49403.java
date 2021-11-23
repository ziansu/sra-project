public int getLimit() {
    if (overlookOuterLimit) {
        return limit;
    }else {
        return java.lang.Math.min(limit, org.apache.kylin.common.debug.BackdoorToggles.getStatementMaxRows());
    }
}