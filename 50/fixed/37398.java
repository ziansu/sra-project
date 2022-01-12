public com.developmentontheedge.sql.model.AstDelete where(java.util.Map<java.lang.String, java.lang.String> conditions) {
    java.util.Objects.requireNonNull(conditions);
    if (!(conditions.isEmpty()))
        setWhere(new com.developmentontheedge.sql.model.AstWhere(conditions));
    
    return this;
}