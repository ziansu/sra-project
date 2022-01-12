@java.lang.Override
public com.hazelcast.jet.Job newJob(com.hazelcast.jet.DAG dag) {
    com.hazelcast.jet.impl.JetClientInstanceImpl.JobImpl job = new com.hazelcast.jet.impl.JetClientInstanceImpl.JobImpl(dag, new com.hazelcast.jet.config.JobConfig());
    job.init();
    return job;
}