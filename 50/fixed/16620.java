@java.lang.Override
public boolean removeAll(java.util.Collection<?> collection) {
    com.jcwhatever.nucleus.utils.PreCon.notNull(collection);
    boolean isModified = false;
    for (java.lang.Object entry : collection) {
        isModified = (remove(entry)) || isModified;
    }
    return isModified;
}