public void checkCommand() {
    usecase.JSONObject jObject;
    try {
        jObject = new usecase.JSONObject(commandStr);
        java.util.Iterator<java.lang.String> keys = jObject.keys();
        java.lang.System.out.println("All keys from JSON String:");
        while (keys.hasNext()) {
            java.lang.String key = keys.next();
            java.lang.System.out.println(((key + " ") + (jObject.getString(key).toString())));
        } 
    } catch (usecase.org.json e) {
        e.printStackTrace();
    }
}