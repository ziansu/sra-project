@java.lang.Override
public com.github.jakubkolar.autobuilder.api.BuilderDSL<T> with(java.util.Map<java.lang.String, java.lang.Object> properties) {
    com.github.jakubkolar.autobuilder.api.BuilderDSL<T> result = this;
    for (java.util.Map.Entry<java.lang.String, java.lang.Object> prop : properties.entrySet()) {
        result = result.with(prop.getKey(), prop.getValue());
    }
    return result;
}