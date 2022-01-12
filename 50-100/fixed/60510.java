@java.lang.Override
public void submitPurchaseApply(edu.ynu.message.PurchaseApplySubmit submit, java.lang.String userId) {
    edu.ynu.entity.ProjectEntity entity = edu.ynu.util.TransformUtil.toEntity(submit);
    entity.setUserId(userId);
    java.lang.String now = java.lang.String.valueOf(new java.sql.Timestamp(new java.util.Date().getTime()));
    entity.setSubmitTime(now);
    entity.setStatus("待审核");
    entity.setProjectId(getCurrentProjectId());
    java.lang.System.out.println(getCurrentProjectId());
    projectDao.save(entity);
}