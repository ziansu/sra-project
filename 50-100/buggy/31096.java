@java.lang.Override
public int hashCode() {
    int result = super.hashCode();
    result = (31 * result) + (classType.hashCode());
    result = (31 * result) + (cardDetail.hashCode());
    result = (31 * result) + (name.hashCode());
    return result;
}