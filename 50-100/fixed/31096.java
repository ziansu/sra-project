@java.lang.Override
public int hashCode() {
    int result = super.hashCode();
    result = (31 * result) + ((classType) != null ? classType.hashCode() : 0);
    result = (31 * result) + ((cardDetail) != null ? cardDetail.hashCode() : 0);
    result = (31 * result) + ((name) != null ? name.hashCode() : 0);
    return result;
}