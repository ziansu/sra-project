private static java.lang.String bestMatchForFlowExecIdLikeValue(java.lang.String value) {
    models.AppResult result = AppResult.find.select(AppResult.TABLE.FLOW_EXEC_ID).where().like(AppResult.TABLE.FLOW_DEF_ID, value).order().desc(AppResult.TABLE.FINISH_TIME).setMaxRows(1).findUnique();
    if (result != null) {
        return result.flowExecId;
    }
    return null;
}