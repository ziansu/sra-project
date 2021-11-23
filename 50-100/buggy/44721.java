public com.ccloomi.core.common.sql.imp.SQLMaker LEFT_JOIN(com.ccloomi.core.common.entity.BaseEntity entity, java.lang.String alias, java.lang.String on) {
    this.join_table_alias_on.put((" LEFT JOIN " + (entity.tableName())), (" ON " + alias));
    this.alias_entity.put(alias, entity);
    return this;
}