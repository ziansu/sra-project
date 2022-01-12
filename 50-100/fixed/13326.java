@java.lang.Override
public by.ostis.common.sctpclient.model.ScAddress getAnswer(final byte[] bytes, final by.ostis.common.sctpclient.model.response.SctpResponseHeader responseHeader) {
    final by.ostis.common.sctpclient.model.response.SctpResultType resultType = responseHeader.getResultType();
    by.ostis.common.sctpclient.model.ScAddress scAddress = null;
    if ((by.ostis.common.sctpclient.model.response.SctpResultType.SCTP_RESULT_OK) == resultType) {
        scAddress = by.ostis.common.sctpclient.transport.TypeBuilder.buildScAddress(bytes);
    }
    return scAddress;
}