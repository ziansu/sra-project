@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sbItems = new java.lang.StringBuilder();
    sbItems.append('(');
    for (entities.Item item : items) {
        sbItems.append(item.toString());
        sbItems.append(", ");
    }
    sbItems.append(')');
    return java.lang.String.format("Collection {id=%s, name=%s, description=%s, size=%s items=%s}", id, name, description, size, sbItems.toString());
}