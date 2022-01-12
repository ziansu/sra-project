private com.jeremydeanlakey.json.Json getJobject() {
    require('{');
    com.jeremydeanlakey.json.Jobject object = new com.jeremydeanlakey.json.Jobject();
    android.util.Pair<java.lang.String, com.jeremydeanlakey.json.Json> keyValue = getKeyValue();
    while (keyValue != null) {
        object.put(keyValue.first, keyValue.second);
        keyValue = getKeyValue();
        allowWhiteSpaceAndComments();
        if (peek('}'))
            break;
        
        require(',');
    } 
    allowWhiteSpaceAndComments();
    require('}');
    return object;
}