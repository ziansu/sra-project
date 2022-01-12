@com.fasterxml.jackson.annotation.JsonIgnore
@com.orbitz.consul.model.kv.Value.Lazy
public com.google.common.base.Optional<java.lang.String> getValueAsString() {
    if (getValue().isPresent()) {
        return com.google.common.base.Optional.of(new java.lang.String(com.google.common.io.BaseEncoding.base64().decode(getValue().get())));
    }else {
        return com.google.common.base.Optional.absent();
    }
}