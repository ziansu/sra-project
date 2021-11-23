public void addBatch(java.lang.String batchId) {
    net.smartcosmos.android.ProfilesTransactionRequest.ObjectEntity[] batchObjects = new net.smartcosmos.android.ProfilesTransactionRequest.ObjectEntity[1];
    batchObjects[0] = new net.smartcosmos.android.ProfilesTransactionRequest.ObjectEntity();
    batchObjects[0].objectUrn = (net.smartcosmos.android.ProfilesTransactionRequest.PREFIX_BATCH) + batchId;
    batchObjects[0].type = net.smartcosmos.android.ProfilesTransactionRequest.TYPE_BATCH;
    batchObjects[0].name = batchId;
    addObjects(batchObjects);
}