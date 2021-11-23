public void retrieveArrayfromJson(java.lang.String sourcePath) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    try {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(sourcePath));
        test.GSON.Example.ToJSONFromArray obj = gson.fromJson(br, test.GSON.Example.ToJSONFromArray.class);
        java.lang.System.out.println(obj.getMainJsonArray());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}