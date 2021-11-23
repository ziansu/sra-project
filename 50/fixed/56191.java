@java.lang.Override
public org.hibernate.validator.metadata.aggregated.ParameterMetaData build(boolean defaultGroupSequenceRedefined, java.util.List<java.lang.Class<?>> defaultGroupSequence) {
    return new org.hibernate.validator.metadata.aggregated.ParameterMetaData(adaptOriginsAndImplicitGroups(rootClass, constraints), isCascading, name, parameterType, parameterIndex, defaultGroupSequenceRedefined, defaultGroupSequence);
}