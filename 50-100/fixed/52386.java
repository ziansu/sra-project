@java.lang.Override
public void validateXml() throws java.io.IOException {
    java.util.List<java.lang.String> errors = new java.util.ArrayList<>();
    store.validateXml(collection, book, errors, errors);
    if (!(errors.isEmpty())) {
        reportError("Errors:", errors);
    }
}