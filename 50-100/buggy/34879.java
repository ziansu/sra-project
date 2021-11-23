@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    java.lang.String address = getAddress();
    result = ((((prime * result) + (address == null ? 0 : address.hashCode())) + (clusterName)) == null) ? 0 : clusterName.hashCode();
    return result;
}