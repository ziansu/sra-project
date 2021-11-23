public autumn.database.AbstractQuery<T> where(java.util.function.Function<T, autumn.database.Condition> conditionFunc) {
    if ((this.whereCondition) == null)
        this.whereCondition = conditionFunc.apply(table);
    else
        this.whereCondition = this.whereCondition.and(conditionFunc.apply(table));
    
    return this;
}