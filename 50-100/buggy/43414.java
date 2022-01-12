@java.lang.Override
public java.util.List<com.lts.queue.domain.JobPo> getNeedGenerateJobPos(java.lang.Long checkTime, int topSize) {
    org.mongodb.morphia.query.Query<com.lts.queue.domain.JobPo> query = template.createQuery(com.lts.queue.domain.JobPo.class);
    query.field("relyOnPrevCycle").equal(true);
    query.field("lastGenerateTriggerTime").equal(checkTime);
    query.offset(0).limit(topSize);
    return query.asList();
}