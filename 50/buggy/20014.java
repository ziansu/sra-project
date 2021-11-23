@java.lang.Override
public void disconnected() {
    show("disconnected");
    m_connectionPanel.m_status.setText("disconnected");
}