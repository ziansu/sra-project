@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    int var = 0;
    if ((name) == null) {
        var = 0;
    }else {
        var = name.hashCode();
    }
    result = (prime * result) + var;
    result = (prime * result) + (time);
    result = (prime * result) + (value);
    return result;
}