protected void deactivate(org.osgi.service.component.ComponentContext componentContext) {
    org.eclipse.kura.cloud.Cloudlet.s_logger.info("Releasing CloudApplicationClient for {}...", m_applicationId);
    if ((m_cloudClient) != null) {
        m_cloudClient.release();
    }
}