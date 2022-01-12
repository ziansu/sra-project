@java.lang.Override
public void hideControlPoints() {
    if ((m_HandlerRegistrationManager) != null) {
        m_HandlerRegistrationManager.destroy();
        m_connector.destroyPointHandles();
        m_HandlerRegistrationManager = null;
    }
}