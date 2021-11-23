@java.lang.Override
public void setIdAttributeValue(final T entity, final java.io.Serializable id) {
    org.springframework.util.Assert.notNull(entity);
    org.springframework.util.Assert.notNull(id);
    org.springframework.data.mapping.PersistentPropertyAccessor accessor = new org.springframework.data.mapping.model.ConvertingPropertyAccessor(this.persistentEntity.getPropertyAccessor(entity), conversionService);
    accessor.setProperty(this.persistentEntity.getIdProperty(), id);
}