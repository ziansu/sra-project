private static java.lang.String toString(java.lang.Object input) {
    if (input == null) {
        return "null";
    }else
        if (input instanceof java.util.Map) {
            com.google.gson.Gson gson = new com.google.gson.Gson();
            return gson.toJson(((java.util.Map) (input)));
        }else
            if (input instanceof java.util.List) {
                com.google.gson.Gson gson = new com.google.gson.Gson();
                return gson.toJson(((java.util.List) (input)));
            }else {
                return input.toString();
            }
        
    
}