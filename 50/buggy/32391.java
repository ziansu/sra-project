private java.lang.String convertToPrettyStr(java.lang.String inputStr) {
    java.lang.Object obj = gson.fromJson(inputStr, java.lang.Object.class);
    java.lang.String jsonStr = gson.toJson(obj);
    return jsonStr;
}