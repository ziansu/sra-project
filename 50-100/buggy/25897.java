public boolean synchronize() {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.ArrayList<java.lang.String> urlList = ((java.util.ArrayList<java.lang.String>) (this.jsonUrlList.keySet()));
    for (int i = 0; i < (urlList.size()); i++) {
        this.fetchJsonFile(urlList.get(i));
    }
    this.synchronizedData = this.parseJsonFiles();
    return this.synchronizedData;
}