@java.lang.Override
public void sessionOpened(org.apache.mina.core.session.IoSession session) throws java.lang.Exception {
    session.getFilterChain().addLast("io", codec);
    clients.add(session);
}