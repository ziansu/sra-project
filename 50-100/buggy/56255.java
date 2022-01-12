public void readSemantics(java.lang.String path, util.Sentiment s) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    try {
        s = gson.fromJson(new java.io.FileReader(path), util.Sentiment.class);
        java.lang.System.out.println("-------------");
    } catch (com.google.gson.JsonIOException e) {
        e.printStackTrace();
    } catch (com.google.gson.JsonSyntaxException e) {
        e.printStackTrace();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}