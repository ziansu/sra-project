public void load(TModel model, com.raizlabs.android.dbflow.structure.database.DatabaseWrapper databaseWrapper) {
    getSingleModelLoader().load(databaseWrapper, com.raizlabs.android.dbflow.sql.language.SQLite.select().from(getModelClass()).where(getPrimaryConditionClause(model)).getQuery());
}