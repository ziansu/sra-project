public android.os.Bundle getParams() {
    android.os.Bundle parameters = android.support.test.InstrumentationRegistry.getArguments();
    for (java.lang.String key : parameters.keySet()) {
        java.lang.String param = parameters.getString(key);
        if ((param != null) && (!(key.equals("class")))) {
            param = android.net.Uri.decode(param);
            parameters = decode(parameters, key, param);
        }
    }
    return parameters;
}