public void close() {
    m_registration.unregister();
    m_context.removeServiceListener(this);
}