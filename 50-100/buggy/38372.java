@java.lang.Override
public void execute(org.sonar.server.computation.ComputationContext context) {
    org.sonar.core.persistence.DbSession session = dbClient.openSession(true);
    try {
        org.sonar.core.measure.db.MetricDto duplicationMetric = dbClient.metricDao().selectByKey(session, CoreMetrics.DUPLICATIONS_DATA_KEY);
        org.sonar.server.computation.step.PersistDuplicationMeasuresStep.DuplicationContext duplicationContext = new org.sonar.server.computation.step.PersistDuplicationMeasuresStep.DuplicationContext(context, duplicationMetric, session);
        int rootComponentRef = context.getReportMetadata().getRootComponentRef();
        recursivelyProcessComponent(duplicationContext, null, rootComponentRef);
        session.commit();
    } finally {
        org.sonar.core.persistence.MyBatis.closeQuietly(session);
    }
}