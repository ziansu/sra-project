@java.lang.Override
public void onEvent() {
    if (((!(this.getIsClosingOrClosed())) && ((sendLink.getLocalState()) == (org.apache.qpid.proton.engine.EndpointState.CLOSED))) || ((sendLink.getRemoteState()) == (org.apache.qpid.proton.engine.EndpointState.CLOSED))) {
        recreateSendLink();
    }
}