public void delete(java.lang.Object o) {
    new database.DBClinReason().deleteAndCommit(((beans.relation.Connection) (o)));
}