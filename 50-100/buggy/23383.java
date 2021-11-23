public java.lang.String build() {
    java.lang.String set = setBuilder.toString().trim();
    set = set.replaceAll(" ", ",");
    java.lang.String query = UPDATE_TEMPLATE;
    query = query.replace("{TABLE}", table);
    query = query.replace("{SET}", set);
    query = query.replace("{WHERE}", golem.mud.common.das.QueryBuilder.buildWhere(conditions));
    return query;
}