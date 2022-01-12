public void checkCommand() {
    usecase.JSONObject jObject;
    try {
        jObject = new usecase.JSONObject(commandStr);
        java.util.Iterator<java.lang.String> keys = jObject.keys();
        while (keys.hasNext()) {
            java.lang.String key = keys.next();
        } 
    } catch (usecase.org.json e) {
        e.printStackTrace();
    }
}