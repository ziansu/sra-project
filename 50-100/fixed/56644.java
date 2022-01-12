public <T> io.requery.sql.QueryBuilder appendWhereConditions(java.util.Set<io.requery.meta.Attribute<T, ?>> attributes) {
    int index = 0;
    for (io.requery.meta.Attribute attribute : attributes) {
        if (index > 0) {
            sb.append(Keyword.AND);
            space();
        }
        attribute(attribute);
        space();
        append("=?");
        space();
        index++;
    }
    return this;
}