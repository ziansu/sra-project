@java.lang.Override
public int hashCode() {
    int result = name.hashCode();
    result = (31 * result) + (depth);
    result = (31 * result) + (maxDepth);
    return result;
}