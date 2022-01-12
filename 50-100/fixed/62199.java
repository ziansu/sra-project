public com.danii.dihub.ReposDataStore create(java.lang.String userName, java.lang.String repoType, java.lang.String sort) {
    com.danii.dihub.DBReposDataStore userDataStore;
    userDataStore = new com.danii.dihub.DBReposDataStore(userName, repoType, sort, context);
    if (userDataStore.isExists()) {
        return userDataStore;
    }else {
        return new com.danii.dihub.NWReposDataStore(userName, repoType, sort, context);
    }
}