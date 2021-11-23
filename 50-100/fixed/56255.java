public util.Sentiment readSemantics(java.lang.String path) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    util.Sentiment s = null;
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
    return s;
}