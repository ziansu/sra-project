public org.exoplatform.task.dao.TaskQuery clone() {
    org.exoplatform.task.dao.condition.Condition condition = getCondition();
    return new org.exoplatform.task.dao.TaskQuery((condition != null ? ((org.exoplatform.task.dao.condition.AggregateCondition) (condition.clone())) : null), getOrderBy(), ((projectIds) != null ? new java.util.ArrayList<java.lang.Long>(projectIds) : null), assignee);
}