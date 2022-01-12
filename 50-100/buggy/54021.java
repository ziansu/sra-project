@java.lang.Override
public java.util.List<? extends tr.org.liderahenk.lider.core.api.persistence.entities.ICommand> findPolicyCommandsWithMailNotification() {
    tr.org.liderahenk.lider.persistence.dao.CommandDaoImpl.logger.debug("Finding Policy Command for mail notification...");
    javax.persistence.Query query = entityManager.createQuery(tr.org.liderahenk.lider.persistence.dao.CommandDaoImpl.FIND_POLICY_COMMANDS_WITH_MAIL_NOTIFICATION);
    query.setParameter("policyEndingStates", tr.org.liderahenk.lider.core.api.messaging.enums.StatusCode.getPolicyEndingStateIds());
    query.setParameter("today", new java.util.Date(), TemporalType.TIMESTAMP);
    return ((java.util.List<tr.org.liderahenk.lider.persistence.entities.CommandImpl>) (query.getResultList()));
}