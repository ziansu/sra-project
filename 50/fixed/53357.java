public com.raizlabs.android.dbflow.sql.language.Set<ModelClass> conditionQuery(com.raizlabs.android.dbflow.sql.builder.ConditionQueryBuilder<ModelClass> conditionQueryBuilder) {
    if (conditionQueryBuilder != null) {
        mConditionQueryBuilder = conditionQueryBuilder;
    }
    return this;
}