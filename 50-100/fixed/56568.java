public java.lang.String[] selectCipherSuites(java.lang.String[] enabledCipherSuites, java.lang.String[] supportedCipherSuites) {
    java.util.List<java.lang.String> selected_ciphers = new java.util.concurrent.CopyOnWriteArrayList<>();
    if (!(_includeCipherSuites.isEmpty()))
        processIncludeCipherSuites(supportedCipherSuites, selected_ciphers);
    else
        selected_ciphers.addAll(java.util.Arrays.asList(enabledCipherSuites));
    
    removeExcludedCipherSuites(selected_ciphers);
    return selected_ciphers.toArray(new java.lang.String[selected_ciphers.size()]);
}