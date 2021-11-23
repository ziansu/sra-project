@java.lang.Override
public int hashCode() {
    int result = id;
    result = (31 * result) + (company.hashCode());
    result = (31 * result) + (activityField.hashCode());
    result = (31 * result) + (address.hashCode());
    return result;
}