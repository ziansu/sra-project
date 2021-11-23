@java.lang.Override
public boolean apply(@javax.annotation.Nullable
org.apache.jackrabbit.oak.api.PropertyState property) {
    if (property != null) {
        return (getTreePermission().canRead(property)) || (isNew(property.getName()));
    }else {
        return false;
    }
}