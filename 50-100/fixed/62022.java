@java.lang.Override
@org.springframework.scheduling.annotation.Scheduled(fixedDelay = 300000, initialDelay = 1000)
public void run() {
    try {
        org.ocha.hdx.jobs.MetadataUpdater.log.debug("Starting MetadataUpdater.run");
        this.ckanSynchronizerServiceImpl.updateMetadataToCkan(10);
        org.ocha.hdx.jobs.MetadataUpdater.log.debug("After MetadataUpdater.run");
    } catch (final java.lang.Throwable e) {
        org.ocha.hdx.jobs.MetadataUpdater.log.error(e.toString(), e);
    }
}