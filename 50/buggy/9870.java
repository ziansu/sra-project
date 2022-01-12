@java.lang.Override
public void inputClosed(org.apache.mina.core.session.IoSession session) throws java.lang.Exception {
    this.trigger(session, HandlerEventType.InputClosed, null);
}