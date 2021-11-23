@java.lang.Override
public void sessionOpened(org.apache.mina.core.session.IoSession session) throws java.lang.Exception {
    session.getFilterChain().addLast("io", codec);
    java.lang.System.out.println(("BroadcastServiceHandler: adding client " + session));
    clients.add(session);
}