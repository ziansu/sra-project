@javax.annotation.Nullable
@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public java.lang.Object getTransferLocation(@javax.annotation.Nonnull
java.lang.Object object, @javax.annotation.Nonnull
java.lang.String key) {
    com.google.common.collect.Multimap<java.lang.Class<?>, org.squiddev.plethora.api.transfer.ITransferProvider<?>> map = primary;
    java.lang.String[] parts = key.split("\\.");
    for (java.lang.String part : parts) {
        java.lang.Object next = getTransferPart(object, part, map);
        if (next == null) {
            return null;
        }else {
            object = next;
            map = secondary;
        }
    }
    return object;
}