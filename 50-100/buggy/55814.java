@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + ((iofs) == null ? 0 : iofs.hashCode());
    result = (prime * result) + (marked ? 1231 : 1237);
    result = (prime * result) + ((rule) == null ? 0 : rule.hashCode());
    result = (prime * result) + (sessionID);
    return result;
}