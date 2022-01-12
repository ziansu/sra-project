@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + ((iofs.getId()) == null ? 0 : iofs.getId().hashCode());
    result = (prime * result) + ((rule) == null ? 0 : rule.hashCode());
    result = (prime * result) + (sessionID);
    return result;
}