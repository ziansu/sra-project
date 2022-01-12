public long getPlatformId(java.lang.String platformName) {
    for (com.kentheken.library.models.Platform platform : mPlatforms) {
        if (platform.getName().equals(platformName))
            return platform.getId();
        
    }
    return -1;
}