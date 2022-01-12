private void setDelegateContext() {
    org.slf4j.spi.MDCAdapter adapter = org.slf4j.MDC.getMDCAdapter();
    if (((m_bundle) != null) && (adapter != null)) {
        adapter.put("bundle.id", java.lang.String.valueOf(m_bundle.getBundleId()));
        adapter.put("bundle.name", m_bundle.getSymbolicName());
        adapter.put("bundle.version", ((java.lang.String) (m_bundle.getHeaders().get(Constants.BUNDLE_VERSION))));
    }
}