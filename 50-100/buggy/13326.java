@java.lang.Override
public java.util.List<by.ostis.common.sctpclient.model.ScAddress> getAnswer(final byte[] bytes, final by.ostis.common.sctpclient.model.response.SctpResponseHeader responseHeader) {
    final java.util.List<by.ostis.common.sctpclient.model.ScAddress> list = new java.util.ArrayList<by.ostis.common.sctpclient.model.ScAddress>();
    final by.ostis.common.sctpclient.model.response.SctpResultType resultType = responseHeader.getResultType();
    if ((by.ostis.common.sctpclient.model.response.SctpResultType.SCTP_RESULT_OK) == resultType) {
        final by.ostis.common.sctpclient.model.ScAddress scAddress = by.ostis.common.sctpclient.transport.TypeBuilder.buildScAddress(bytes);
        list.add(scAddress);
    }
    return list;
}