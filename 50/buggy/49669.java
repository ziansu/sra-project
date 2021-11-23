@java.lang.Override
public void actionPerformed() {
    m_controller.cancelPositions(apidemo.ApiDemo.INSTANCE.m_mktDataPanel.getCallback());
    m_controller.disconnect();
}