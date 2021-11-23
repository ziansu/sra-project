@java.lang.Override
public int hashCode() {
    int result = category.hashCode();
    result = (31 * result) + (name.hashCode());
    result = (31 * result) + (value.hashCode());
    return result;
}