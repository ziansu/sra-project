@java.lang.Override
public common.messages.KVMessage get(java.lang.String key) throws java.lang.Exception {
    common.messages.MessageType request = new common.messages.MessageType("get", "", key, "");
    if ((request.error) != null) {
        throw new java.lang.Exception(request.error);
    }
    if (!(connectToResponsible(key))) {
        return null;
    }
    return sendRequest(request);
}