private Ds3ClientHelpers.Job innerStartReadJob(final java.util.List<com.spectralogic.ds3client.helpers.Ds3Object> objects, final com.spectralogic.ds3client.helpers.GetBulkJobSpectraS3Request getBulkJobSpectraS3Request, final com.spectralogic.ds3client.helpers.strategy.transferstrategy.TransferStrategyBuilder transferStrategyBuilder) throws java.io.IOException {
    final com.spectralogic.ds3client.helpers.GetBulkJobSpectraS3Response getBulkJobSpectraS3Response = this.client.getBulkJobSpectraS3(getBulkJobSpectraS3Request);
    final com.google.common.collect.ImmutableMultimap<java.lang.String, com.spectralogic.ds3client.models.common.Range> partialRanges = com.spectralogic.ds3client.helpers.util.PartialObjectHelpers.getPartialObjectsRanges(objects);
    final com.spectralogic.ds3client.helpers.MasterObjectList masterObjectList = getBulkJobSpectraS3Response.getResult();
    transferStrategyBuilder.withMasterObjectList(masterObjectList).withRangesForBlobs(com.spectralogic.ds3client.helpers.util.PartialObjectHelpers.mapRangesToBlob(masterObjectList.getObjects(), partialRanges));
    return new com.spectralogic.ds3client.helpers.ReadJobImpl(transferStrategyBuilder);
}