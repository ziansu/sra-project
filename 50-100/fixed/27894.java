public java.lang.Long calculeNumberOfIssues(java.lang.String fileName, java.lang.String fixVersion) {
    java.lang.Long fileNumberOfPullrequestOfPairFuture;
    if (issueFileMap.containsKey(fileName)) {
        fileNumberOfPullrequestOfPairFuture = issueFileMap.get(fileName);
    }else {
        fileNumberOfPullrequestOfPairFuture = fileDAO.calculeNumberOfIssues(fileName, fixVersion);
        issueFileMap.put(fileName, fileNumberOfPullrequestOfPairFuture);
    }
    return fileNumberOfPullrequestOfPairFuture;
}