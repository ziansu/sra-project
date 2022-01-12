@java.lang.Override
public int compareTo(dsn.base.blob other) {
    if (!(getClass().equals(other.getClass()))) {
        return getClass().getName().compareTo(other.getClass().getName());
    }
    return data.compareTo(other.data);
}