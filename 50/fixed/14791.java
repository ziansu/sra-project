@java.lang.Override
public boolean addAll(java.util.Collection<? extends E> collection) {
    com.jcwhatever.nucleus.utils.PreCon.notNull(collection);
    boolean isModified = false;
    for (E entry : collection) {
        isModified = (add(entry)) || isModified;
    }
    return isModified;
}