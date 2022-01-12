@java.lang.Override
public com.atlassian.DecisionDocumentation.db.DecisionComponentEntity doInTransaction() {
    com.atlassian.DecisionDocumentation.db.DecisionComponentEntity[] decisionsArray = ao.find(com.atlassian.DecisionDocumentation.db.DecisionComponentEntity.class, net.java.ao.Query.select().where("KEY = ?", issueKey));
    com.atlassian.DecisionDocumentation.db.DecisionComponentEntity decComponent = null;
    if ((decisionsArray.length) == 1) {
        decComponent = decisionsArray[0];
    }
    return decComponent;
}