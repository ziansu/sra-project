public static org.springframework.core.io.support.ResourcePatternResolver getResourcePatternResolver(org.springframework.core.io.ResourceLoader resourceLoader) {
    if (resourceLoader instanceof org.springframework.core.io.support.ResourcePatternResolver) {
        return ((org.springframework.core.io.support.ResourcePatternResolver) (resourceLoader));
    }else
        if (resourceLoader != null) {
            return new org.springframework.core.io.support.PathMatchingResourcePatternResolver(resourceLoader);
        }else {
            return new org.springframework.core.io.support.PathMatchingResourcePatternResolver();
        }
    
}