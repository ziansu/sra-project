public com.iquanwai.platon.biz.po.WarmupSubmit getWarmupSubmit(java.lang.Integer planId, java.lang.Integer questionId, java.lang.Integer profileId) {
    org.apache.commons.dbutils.QueryRunner run = new org.apache.commons.dbutils.QueryRunner(getDataSource());
    org.apache.commons.dbutils.ResultSetHandler<com.iquanwai.platon.biz.po.WarmupSubmit> h = new org.apache.commons.dbutils.handlers.BeanHandler(com.iquanwai.platon.biz.po.WarmupSubmit.class);
    try {
        com.iquanwai.platon.biz.po.WarmupSubmit submit = run.query("SELECT * FROM WarmupSubmit where PlanId=? and QuestionId=? and ProfileId=?", h, planId, questionId, profileId);
        return submit;
    } catch (java.sql.SQLException e) {
        logger.error(e.getLocalizedMessage(), e);
    }
    return null;
}