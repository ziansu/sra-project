public com.eptd.dsaver.core.SonarMetrics getSonarMetrics(java.lang.String key) {
    for (int i = 0; i < (sonarMetrics.size()); i++) {
        if (sonarMetrics.get(i).getKey().equals(key))
            return sonarMetrics.get(i);
        
    }
    return null;
}