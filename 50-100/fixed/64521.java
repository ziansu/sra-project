@java.lang.Override
protected java.lang.Void doInBackground(java.lang.String... parameters) {
    if (parameters[2].equals("GET")) {
        sendGet(parameters);
    }else
        if (parameters[2].equals("POST")) {
            sendPost(parameters);
        }
    
    return null;
}