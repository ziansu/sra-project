@java.lang.Override
public void messageReceived(org.apache.mina.core.session.IoSession session, java.lang.Object message) {
    java.lang.String str = message.toString();
    if ("quit".equalsIgnoreCase(str.trim())) {
        session.closeNow();
        return ;
    }
    java.util.Date date = new java.util.Date();
    session.write(date.toString());
}