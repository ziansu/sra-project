public nuclei.persistence.db.Query newSelectQuery(java.lang.String name, java.lang.String selection, java.lang.String orderBy, java.util.List<nuclei.persistence.db.EntityProperty> properties) {
    for (nuclei.persistence.db.Query e : selectQueries) {
        if (e.getName().equals(name))
            return e;
        
    }
    nuclei.persistence.db.Query q = new nuclei.persistence.db.Query(name, selection, orderBy, properties);
    selectQueries.add(q);
    return q;
}