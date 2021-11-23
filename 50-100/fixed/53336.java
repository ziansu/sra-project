@java.lang.Override
public int hashCode() {
    int result = modelCallbacks.hashCode();
    result = (31 * result) + (title.hashCode());
    result = (31 * result) + (required ? 1 : 0);
    result = (31 * result) + (parentKey.hashCode());
    return result;
}