@java.lang.Override
public java.lang.String entityNameFromClassName(java.lang.String className) {
    for (javax.persistence.metamodel.EntityType<?> entity : metamodel.getEntities()) {
        if (entity.getJavaType().getName().equals(className)) {
            if (!(useHibernateFullEntityNames))
                return entity.getName();
            else
                return className;
            
        }
    }
    return null;
}