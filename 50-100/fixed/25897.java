public boolean synchronize() {
    java.util.Set<java.lang.String> urlList = this.jsonUrlList.keySet();
    for (java.lang.String key : urlList) {
        this.fetchJsonFile(key);
    }
    this.synchronizedData = this.parseJsonFiles();
    return this.synchronizedData;
}