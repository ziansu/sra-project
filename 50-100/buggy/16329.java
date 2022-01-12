public static org.springframework.core.io.support.ResourcePatternResolver getResourcePatternResolver(org.springframework.core.io.ResourceLoader resourceLoader) {
    org.springframework.util.Assert.notNull(resourceLoader, "ResourceLoader must not be null");
    if (resourceLoader instanceof org.springframework.core.io.support.ResourcePatternResolver) {
        return ((org.springframework.core.io.support.ResourcePatternResolver) (resourceLoader));
    }else
        if (resourceLoader != null) {
            return new org.springframework.core.io.support.PathMatchingResourcePatternResolver(resourceLoader);
        }else {
            return new org.springframework.core.io.support.PathMatchingResourcePatternResolver();
        }
    
}