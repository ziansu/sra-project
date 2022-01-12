private static java.lang.Class<? extends java.lang.Object> getContentType(jade.lang.acl.ACLMessage msg) {
    try {
        java.lang.Object content = msg.getContentObject();
        return content.getClass();
    } catch (jade.lang.acl.UnreadableException e) {
        e.printStackTrace();
    }
    return null;
}