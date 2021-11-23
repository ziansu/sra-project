private void markEntitiesForDeletionAndSave(java.util.List<test.dbDataAbstractions.entities.bases.BaseEntity> bel) {
    org.hibernate.Session s = getActiveTransactionSession();
    for (test.dbDataAbstractions.entities.bases.BaseEntity b : bel) {
        b.setDele(true);
        s.save(b);
    }
}