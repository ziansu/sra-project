@java.lang.Override
public common.messages.KVMessage put(java.lang.String key, java.lang.String value) throws java.lang.Exception {
    common.messages.MessageType request = new common.messages.MessageType("put", "", key, value);
    if ((request.error) != null) {
        throw new java.lang.Exception(request.error);
    }
    if (!(connectToResponsible(key))) {
        return null;
    }
    return sendRequest(request);
}