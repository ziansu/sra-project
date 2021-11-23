@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void onPreMigrate() {
    mQuery = new com.raizlabs.android.dbflow.sql.QueryBuilder(new com.raizlabs.android.dbflow.sql.language.Update().table(mTable).set(mSetConditionQueryBuilder).where(mWhereConditionQueryBuilder).getQuery());
}