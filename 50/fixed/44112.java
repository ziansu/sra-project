public static com.google.common.base.Optional<org.w3c.dom.Node> getOptionalNode(java.lang.String xpath, org.w3c.dom.Node document) {
    try {
        return com.google.common.base.Optional.of(org.automagic.deps.doctor.Utils.getNode(xpath, document));
    } catch (java.util.NoSuchElementException e) {
        return com.google.common.base.Optional.absent();
    }
}