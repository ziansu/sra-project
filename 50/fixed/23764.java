public void validate(java.lang.String path) {
    if (!(matches(path))) {
        throw new com.google.api.gax.protobuf.ValidationException(java.lang.String.format("Parameter \"%s\" must be in the form \"%s\"", path, this.toString()));
    }
}