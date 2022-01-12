public org.unidal.dal.jdbc.test.data.entity.DatabaseModel dump(org.unidal.dal.jdbc.test.data.entity.DatabaseModel base, java.lang.String ds, java.lang.String... tables) throws org.unidal.dal.jdbc.DalException {
    org.unidal.dal.jdbc.test.data.entity.DatabaseModel model = new org.unidal.dal.jdbc.test.data.entity.DatabaseModel();
    for (java.lang.String table : tables) {
        java.util.List<org.unidal.dal.jdbc.raw.RawDataObject> rowset = m_dao.executeQuery(ds, java.lang.String.format("select * from `%s`", table));
        org.unidal.dal.jdbc.test.DatabaseDumper.TableBuilder builder = new org.unidal.dal.jdbc.test.DatabaseDumper.TableBuilder(table, rowset);
        model.accept(builder);
    }
    base.accept(new org.unidal.dal.jdbc.test.DatabaseDumper.DeltaRemoval(model, ds));
    return model;
}