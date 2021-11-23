public java.lang.Double getSonarMetrics(java.lang.String key) {
    for (int i = 0; i < (sonarMetrics.size()); i++) {
        if ((sonarMetrics.get(i).getKey().compareTo(key)) == 0)
            return sonarMetrics.get(i).getValue();
        
    }
    return new java.lang.Double(0.0);
}