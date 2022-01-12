public org.hibernate.validator.metadata.aggregated.BeanMetaDataImpl<T> build() {
    java.util.Set<org.hibernate.validator.metadata.aggregated.ConstraintMetaData> aggregatedElements = org.hibernate.validator.metadata.aggregated.BeanMetaDataImpl.BeanMetaDataBuilder.newHashSet();
    for (org.hibernate.validator.metadata.aggregated.BeanMetaDataImpl.BuilderDelegate oneBuilder : builders) {
        aggregatedElements.addAll(oneBuilder.build(((((defaultGroupSequence) != null) && ((defaultGroupSequence.size()) > 1)) || ((defaultGroupSequenceProvider) != null)), defaultGroupSequence));
    }
    return new org.hibernate.validator.metadata.aggregated.BeanMetaDataImpl<T>(beanClass, defaultGroupSequence, defaultGroupSequenceProvider, aggregatedElements);
}