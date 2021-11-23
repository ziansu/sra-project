private static void buildJpqlWhereParams(java.lang.StringBuilder b, java.util.Set<javax.persistence.filter.core.Where> wheres) {
    b.append("WHERE ");
    for (java.util.Iterator<javax.persistence.filter.core.Where> i = wheres.iterator(); i.hasNext();) {
        javax.persistence.filter.core.Where where = i.next();
        b.append(where.getClause());
        if (i.hasNext()) {
            b.append("AND");
            b.append(" ");
        }
    }
}