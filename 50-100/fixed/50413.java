@org.junit.Test
public void testRDResourcePublishOnResponseReceived() throws java.lang.Exception {
    org.iotivity.cloud.ciserver.resources.proxy.rd.ResourceDirectory.AccountReceiveHandler accountReceiveHandler = new org.iotivity.cloud.ciserver.resources.proxy.rd.ResourceDirectory.AccountReceiveHandler(rdPublishRequest, mMockDevice);
    org.iotivity.cloud.base.protocols.IRequest request = makeResourcePublishRequest();
    accountReceiveHandler.onResponseReceived(org.iotivity.cloud.base.protocols.MessageBuilder.createResponse(request, ResponseStatus.CHANGED));
    org.junit.Assert.assertEquals(mReqRDServer, rdPublishRequest);
    org.junit.Assert.assertTrue(mLatch.await(1L, java.util.concurrent.TimeUnit.SECONDS));
}