public nuclei.persistence.db.Query newDeleteQuery(java.lang.String name, java.lang.String selection) {
    for (nuclei.persistence.db.Query e : deleteQueries) {
        if (e.getName().equals(name))
            return e;
        
    }
    nuclei.persistence.db.Query q = new nuclei.persistence.db.Query(name, selection, null, this, null);
    deleteQueries.add(q);
    return q;
}