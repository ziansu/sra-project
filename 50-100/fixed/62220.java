public void postTools(final java.lang.String URL, final java.lang.String jsonData) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    com.whatever.nurseapp.nurseapp.Okhttp_tools.handler obj = new com.whatever.nurseapp.nurseapp.Okhttp_tools.handler(URL, jsonData);
    java.util.concurrent.Future<java.util.ArrayList> F1 = execute.submit(obj);
    this.response = F1.get();
    execute.shutdown();
}