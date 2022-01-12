@java.lang.Override
public int hashCode() {
    int result = ((getDateFrom()) != null) ? getDateFrom().hashCode() : 0;
    result = (31 * result) + ((getUser()) != null ? getUser().hashCode() : 0);
    result = (31 * result) + ((getBookInstance()) != null ? getBookInstance().hashCode() : 0);
    return result;
}