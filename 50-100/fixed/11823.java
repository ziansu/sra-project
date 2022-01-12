private java.util.Collection<com.google.protobuf.Descriptors.FieldDescriptor> findSourceFields(com.google.protobuf.Descriptors.FieldDescriptor enrichmentField) {
    final java.lang.String byOptionArgument = enrichmentField.getOptions().getExtension(EventAnnotationsProto.by);
    com.google.common.base.Preconditions.checkNotNull(byOptionArgument);
    final int pipeSeparatorIndex = byOptionArgument.indexOf(org.spine3.server.event.enrich.ReferenceValidator.PIPE_SEPARATOR);
    if (pipeSeparatorIndex < 0) {
        return java.util.Collections.singleton(findSourceFieldByName(byOptionArgument, enrichmentField, true));
    }else {
        final java.lang.String[] targetFieldNames = org.spine3.server.event.enrich.ReferenceValidator.PATTERN_PIPE_SEPARATOR.split(byOptionArgument);
        return findSourceFieldsByNames(targetFieldNames, enrichmentField);
    }
}