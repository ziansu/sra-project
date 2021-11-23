private void addMetaDataToBuilder(org.hibernate.validator.metadata.raw.ConstrainedElement constrainableElement, java.util.Set<org.hibernate.validator.metadata.aggregated.BeanMetaDataImpl.BuilderDelegate> builders) {
    for (org.hibernate.validator.metadata.aggregated.BeanMetaDataImpl.BuilderDelegate oneBuilder : builders) {
        boolean foundBuilder = oneBuilder.add(constrainableElement);
        if (foundBuilder) {
            return ;
        }
    }
    builders.add(new org.hibernate.validator.metadata.aggregated.BeanMetaDataImpl.BuilderDelegate(constrainableElement, constraintHelper));
}