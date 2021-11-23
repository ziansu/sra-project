@java.lang.Override
public int hashCode() {
    int result = getDateFrom().hashCode();
    result = (31 * result) + (getUser().hashCode());
    result = (31 * result) + (getBookInstance().hashCode());
    return result;
}