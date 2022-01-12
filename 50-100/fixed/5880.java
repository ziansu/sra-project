@java.lang.Override
public com.couchbase.client.java.query.dsl.path.LetPath onKeysValues(java.lang.String... constantKeys) {
    if ((constantKeys.length) == 1) {
        return onKeys(com.couchbase.client.java.query.dsl.Expression.s(constantKeys[0]));
    }else {
        return onKeys(com.couchbase.client.java.document.json.JsonArray.from(((java.lang.Object[]) (constantKeys))));
    }
}