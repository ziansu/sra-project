public void searchByPostTitle(java.lang.String title, com.cmpe.bounswe2015group8.westory.back.Consumer<com.cmpe.bounswe2015group8.westory.model.Post[]> callback) {
    if (display)
        progressDialog.show();
    
    java.util.Map<java.lang.String, java.lang.String> dataToSend = new java.util.HashMap<>();
    dataToSend.put("name", title);
    new com.cmpe.bounswe2015group8.westory.back.ServerRequests.RestAsyncTask(callback, org.springframework.http.HttpMethod.POST).execute(new com.cmpe.bounswe2015group8.westory.model.Requestable<com.cmpe.bounswe2015group8.westory.model.Post[]>("/api/searchByPostTitle", dataToSend, com.cmpe.bounswe2015group8.westory.model.Post[].class));
}