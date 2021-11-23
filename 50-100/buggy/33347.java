@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + ((publisherAddress) == null ? 0 : publisherAddress.hashCode());
    result = (prime * result) + ((publisherId) == null ? 0 : publisherId.hashCode());
    result = (prime * result) + ((publisherName) == null ? 0 : publisherName.hashCode());
    return result;
}