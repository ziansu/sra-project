@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + ((name) == null ? 0 : name.hashCode());
    result = (prime * result) + (time);
    result = (prime * result) + (value);
    return result;
}