@java.lang.Override
public void apply(java.lang.String newKey) {
    add(newKey, value);
    remove(key, context);
}