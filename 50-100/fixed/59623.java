@java.lang.Override
public int hashCode() {
    int result = 17;
    result = (31 * result) + ((first) == null ? 0 : first.hashCode());
    result = (31 * result) + (second.hashCode());
    result = (31 * result) + (core.Edge.double_hash_code(weight));
    return result;
}