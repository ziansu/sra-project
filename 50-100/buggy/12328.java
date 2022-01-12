@org.support.project.aop.Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
public void removeHook(java.lang.Integer mailHookId) {
    java.util.List<org.support.project.knowledge.entity.MailHookConditionsEntity> conditions = org.support.project.knowledge.dao.MailHookConditionsDao.get().selectOnHookId(mailHookId);
    for (org.support.project.knowledge.entity.MailHookConditionsEntity mailHookConditionsEntity : conditions) {
        org.support.project.knowledge.dao.MailHookConditionsDao.get().physicalDelete(mailHookConditionsEntity);
    }
    org.support.project.knowledge.dao.MailHooksDao.get().delete(mailHookId);
}