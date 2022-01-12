@android.support.annotation.NonNull
public java.lang.String getDefinition() {
    java.lang.StringBuilder definition = new java.lang.StringBuilder();
    definition.append(getName());
    if (hasAlias()) {
        definition.append(" AS ").append(getAliasName());
    }
    return definition.toString();
}