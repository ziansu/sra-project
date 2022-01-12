public void searchByHeritageName(java.lang.String name, com.cmpe.bounswe2015group8.westory.back.Consumer<com.cmpe.bounswe2015group8.westory.model.Heritage[]> callback) {
    if (display)
        progressDialog.show();
    
    new com.cmpe.bounswe2015group8.westory.back.ServerRequests.RestAsyncTask(callback, org.springframework.http.HttpMethod.POST).execute(new com.cmpe.bounswe2015group8.westory.model.Requestable<com.cmpe.bounswe2015group8.westory.model.Heritage[]>("/api/searchByHeritageName", name, com.cmpe.bounswe2015group8.westory.model.Heritage[].class));
}