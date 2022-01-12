public <T, T2> javax.persistence.TypedQuery<T> where(java.lang.Class<T> cls, java.lang.String column, T2 value) {
    return query((((("SELECT e FROM " + (cls.getName())) + " e WHERE e.") + column) + " = :value"), cls).setParameter("value", value);
}