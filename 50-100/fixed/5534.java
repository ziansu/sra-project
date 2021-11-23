public java.lang.String[] selectImports(org.springframework.core.type.AnnotationMetadata importingClassMetadata) {
    com.github.jetqin.orm.constants.OrmType type = ((com.github.jetqin.orm.constants.OrmType) (importingClassMetadata.getAnnotationAttributes(com.github.jetqin.orm.annotation.EnableOrmConfiguration.class.getName()).get("type")));
    if (OrmType.Hibernate.equals(type)) {
        return new java.lang.String[]{ com.github.jetqin.orm.configuration.HibernateOrmConfiguration.class.getName() };
    }
    if (OrmType.JPA.equals(type)) {
        return new java.lang.String[]{ com.github.jetqin.orm.configuration.JpaOrmConfiguration.class.getName() };
    }
    throw new java.lang.IllegalArgumentException();
}