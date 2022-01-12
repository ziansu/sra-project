private static void setVariantDescription(org.nextprot.api.core.service.impl.Annotation annotation) {
    if (((annotation.getVariant()) != null) && (annotation.getVariant().getVariant().isEmpty())) {
        java.lang.String description = annotation.getDescription();
        annotation.setDescription(("Missing " + (description == null ? "" : description)));
    }
}