@java.lang.Override
public long size() {
    long result;
    if (filtered) {
        result = ((fiql) == null) ? 0 : restClient.searchCount(realm, fiql, type);
    }else {
        result = restClient.count(type, realm);
    }
    return result;
}