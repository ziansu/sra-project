@java.lang.Override
public by.ostis.common.sctpclient.model.response.SctpResponse<by.ostis.common.sctpclient.model.ScAddress> createScArc(final by.ostis.common.sctpclient.utils.constants.ScElementType type, final by.ostis.common.sctpclient.model.ScAddress begAddress, final by.ostis.common.sctpclient.model.ScAddress endAddress) {
    return sendRequest(SctpCommandType.CREATE_ARC_COMMAND, begAddress, endAddress);
}