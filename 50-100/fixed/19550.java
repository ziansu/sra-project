private void releaseTaskResource() {
    if (com.RNFetchBlob.RNFetchBlobReq.taskTable.containsKey(taskId))
        com.RNFetchBlob.RNFetchBlobReq.taskTable.remove(taskId);
    
    if (com.RNFetchBlob.RNFetchBlobReq.uploadProgressReport.containsKey(taskId))
        com.RNFetchBlob.RNFetchBlobReq.uploadProgressReport.remove(taskId);
    
    if (com.RNFetchBlob.RNFetchBlobReq.progressReport.containsKey(taskId))
        com.RNFetchBlob.RNFetchBlobReq.progressReport.remove(taskId);
    
    if ((requestBody) != null)
        requestBody.clearRequestBody();
    
}