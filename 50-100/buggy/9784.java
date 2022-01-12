@java.lang.Override
public java.lang.String generateUri(java.io.File file, java.lang.String id) {
    java.lang.String uri = file.toURI().toString();
    uri = ((getOutputUriPrefix()) != null) ? (getOutputUriPrefix()) + uri : uri;
    uri = ((getOutputUriSuffix()) != null) ? uri + (getOutputUriSuffix()) : uri;
    uri = ((getOutputUriReplace()) != null) ? applyOutputUriReplace(uri, getOutputUriReplace()) : uri;
    return uri;
}