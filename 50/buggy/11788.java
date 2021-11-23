private boolean isFieldSet(final long index) {
    com.oracle.truffle.api.CompilerAsserts.neverPartOfCompilation("isFieldSet");
    som.interpreter.objectstorage.StorageLocation location = getLocation(index);
    return location.isSet(this, true);
}