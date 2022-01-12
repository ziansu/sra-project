private void validate(java.lang.Object source, java.lang.Object observer) {
    com.google.common.base.Preconditions.checkNotNull(source, "source");
    com.google.common.base.Preconditions.checkNotNull(observer, "observer");
    com.google.common.base.Preconditions.checkArgument(verifySource(source), "Source is not the right type!");
    com.google.common.base.Preconditions.checkArgument(verifySource(observer), "Observer is not the right type!");
}