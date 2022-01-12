@android.support.annotation.NonNull
public java.lang.String getDefinition() {
    java.lang.StringBuilder definition = new java.lang.StringBuilder();
    if ((prefixName) != null) {
        definition.append((tickName ? com.raizlabs.android.dbflow.sql.QueryBuilder.quoteIfNeeded(prefixName) : prefixName)).append(".");
    }
    definition.append((tickName ? getName() : getNamePropertyRaw()));
    if (hasAlias()) {
        definition.append(" AS ").append(getAliasName());
    }
    return definition.toString();
}