@java.lang.Override
public boolean apply(@javax.annotation.Nonnull
org.apache.jackrabbit.oak.api.PropertyState property) {
    return (getTreePermission().canRead(property)) || (isNew(property.getName()));
}