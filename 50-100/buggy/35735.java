public M doMapFromContext(org.springframework.ldap.core.DirContextOperations ctx) {
    M register = null;
    try {
        register = getLciModelClass().newInstance();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
    register.setCreatedAt(new java.lang.Integer(ctx.getStringAttribute("dataCriacao")));
    register.setUpdatedAt(new java.lang.Integer(ctx.getStringAttribute("dataRenovacao")));
    mapperResult(register, ctx);
    return register;
}