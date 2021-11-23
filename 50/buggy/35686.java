public org.openid4java.message.Message fetchAttributes(org.openid4java.message.ParameterList pl) throws java.lang.Exception {
    org.openid4java.message.Message m = org.openid4java.message.Message.createMessage(pl);
    if (m.hasExtension(AxMessage.OPENID_NS_AX)) {
        return m;
    }
    return null;
}