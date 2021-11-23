private static com.google.common.base.Optional<org.apache.mesos.Protos.Attribute> getAttribute(java.util.List<org.apache.mesos.Protos.Attribute> attributes, java.lang.String name) {
    for (org.apache.mesos.Protos.Attribute attribute : attributes) {
        if ((attribute.getName()) == name) {
            return com.google.common.base.Optional.of(attribute);
        }
    }
    return com.google.common.base.Optional.fromNullable(null);
}