public <T> javax.persistence.TypedQuery<T> where(java.lang.Class<T> cls, java.lang.String column, java.lang.Object value) {
    return query((((("SELECT e FROM " + (cls.getName())) + " e WHERE e.") + column) + " = :value"), cls).setParameter("value", value);
}