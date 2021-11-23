@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isEmptyNamespace() {
    return (this) == (com.palantir.atlasdb.keyvalue.api.Namespace.EMPTY_NAMESPACE);
}