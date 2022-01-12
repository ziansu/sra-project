@java.lang.Override
public int hashCode() {
    int result = company.hashCode();
    result = (31 * result) + (activityField.hashCode());
    result = (31 * result) + ((address) != null ? address.hashCode() : 0);
    return result;
}