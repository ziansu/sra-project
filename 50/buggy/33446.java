@java.lang.Override
public int hashCode() {
    int result = state;
    result = (31 * result) + ((items) != null ? items.hashCode() : 0);
    return result;
}