@org.junit.Test
public void testRDResourcePublishPayloadConverted() throws java.lang.Exception {
    org.iotivity.cloud.ciserver.resources.proxy.rd.ResourceDirectory.AccountReceiveHandler accountReceiveHandler = mRdHandler.new org.iotivity.cloud.ciserver.resources.proxy.rd.AccountReceiveHandler(rdPublishRequest, mMockDevice);
    org.iotivity.cloud.base.protocols.IRequest request = makeResourcePublishRequest();
    accountReceiveHandler.onResponseReceived(org.iotivity.cloud.base.protocols.MessageBuilder.createResponse(request, ResponseStatus.CHANGED));
    org.junit.Assert.assertEquals(getHrefInTestPublishPayload(mReqRDServer.getPayload()), (("/oic/route/" + (mDi)) + "/a/light"));
}