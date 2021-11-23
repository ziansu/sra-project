@android.support.annotation.NonNull
public java.lang.String getName() {
    java.lang.String fullName = "";
    if ((prefixName) != null) {
        fullName += (tickName ? com.raizlabs.android.dbflow.sql.QueryBuilder.quoteIfNeeded(prefixName) : prefixName) + ".";
    }
    if ((name) != null) {
        fullName += (tickName) ? com.raizlabs.android.dbflow.sql.QueryBuilder.quote(name) : getNamePropertyRaw();
    }
    return fullName;
}