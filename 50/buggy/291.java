@java.lang.Override
public java.util.List<java.lang.Object> getValues() {
    java.util.Set<java.lang.Object> value = getValue();
    if (value == null) {
        return null;
    }
    return org.eclipse.scout.commons.CollectionUtility.arrayList(value);
}