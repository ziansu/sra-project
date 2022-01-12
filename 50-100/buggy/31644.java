public nuclei.persistence.db.Query newUpdateQuery(java.lang.String name, java.lang.String selection, java.util.List<nuclei.persistence.db.EntityProperty> properties) {
    for (nuclei.persistence.db.Query e : updateQueries) {
        if (e.getName().equals(name))
            return e;
        
    }
    nuclei.persistence.db.Query q = new nuclei.persistence.db.Query(name, selection, null, properties);
    updateQueries.add(q);
    return q;
}