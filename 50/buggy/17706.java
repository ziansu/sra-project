public void open() {
    m_context.addServiceListener(this);
    m_registration = m_context.registerService(org.eclipse.osgi.framework.console.CommandProvider.class.getName(), this, null);
}