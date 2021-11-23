@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void persistReportEntities(java.util.List<? extends com.google.api.ads.adwords.awreporting.model.entities.Report> reportEntities) {
    int batchFlush = 0;
    org.hibernate.Session session = this.sessionFactory.getCurrentSession();
    for (com.google.api.ads.adwords.awreporting.model.entities.Report report : reportEntities) {
        report.setId();
        session.saveOrUpdate(report);
        batchFlush++;
        if ((batchFlush % (com.google.api.ads.adwords.awreporting.model.persistence.sql.SqlReportEntitiesPersister.BATCH_SIZE)) == 0) {
            session.flush();
            session.clear();
        }
    }
}