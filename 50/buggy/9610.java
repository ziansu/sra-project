@java.lang.Override
public int hashCode() {
    int result = id;
    result = (31 * result) + (city.hashCode());
    result = (31 * result) + (street.hashCode());
    return result;
}