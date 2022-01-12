@java.lang.Override
public java.lang.String entityNameFromClassName(java.lang.String className) {
    if (!(useHibernateFullEntityNames)) {
        for (javax.persistence.metamodel.EntityType<?> entity : metamodel.getEntities())
            if (entity.getJavaType().getName().equals(className))
                return entity.getName();
            
        
        return null;
    }else
        return className;
    
}