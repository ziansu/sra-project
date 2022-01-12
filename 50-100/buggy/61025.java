@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + (port.getPortNumber());
    result = (prime * result) + ((int) ((sw.getLong()) ^ ((sw.getLong()) >>> 32)));
    return result;
}