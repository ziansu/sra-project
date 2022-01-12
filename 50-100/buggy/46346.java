@org.junit.Test
public void testMakeMultipartRequestInput_METERCONFIG() throws java.lang.Exception {
    final org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.common.types.rev130731.MultipartType mpType = org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.common.types.rev130731.MultipartType.OFPMPMETERCONFIG;
    final org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.MultipartRequestInput mpRqInput = org.opendaylight.openflowplugin.impl.common.MultipartRequestInputFactory.makeMultipartRequestInput(xid, ofVersion, mpType);
    checkHeader(mpRqInput, mpType, ofVersion);
    final org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.multipart.request.MultipartRequestBody mpRqBody = mpRqInput.getMultipartRequestBody();
    org.junit.Assert.assertTrue((mpRqBody instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.multipart.request.multipart.request.body.MultipartRequestMeterConfigCase));
    org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.multipart.request.multipart.request.body.multipart.request.meter.config._case.MultipartRequestMeterConfig mpRq = ((org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.multipart.request.multipart.request.body.MultipartRequestMeterConfigCase) (mpRqBody)).getMultipartRequestMeterConfig();
    org.junit.Assert.assertEquals(OFConstants.OFPM_ALL, mpRq.getMeterId().getValue());
}