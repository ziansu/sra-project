@org.springframework.context.annotation.Bean
public org.atlasapi.remotesite.five.FiveBrandUpdateController fiveBrandUpdateController() {
    return new org.atlasapi.remotesite.five.FiveBrandUpdateController(fiveUpdater());
}