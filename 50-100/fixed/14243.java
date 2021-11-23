@java.lang.Override
public com.ibasco.agql.core.session.SessionId createId(com.ibasco.agql.core.AbstractMessage message) {
    if (!(message instanceof com.ibasco.agql.protocols.valve.source.query.SourceRconMessage)) {
        throw new java.lang.IllegalStateException("Message is not an instance of SourceRconMessage");
    }
    java.lang.String id = new java.lang.StringBuffer().append(createIdStringFromMsg(message)).toString();
    return new com.ibasco.agql.core.session.SessionId(id);
}