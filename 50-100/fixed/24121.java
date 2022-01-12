@org.springframework.scheduling.annotation.Scheduled(fixedDelay = (30 * 60) * 1000)
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public void updateProvisionedDiskSpaceValue() {
    java.lang.Iterable<com.bitwisekaizen.sdss.agent.entity.IscsiTargetEntity> targetEntities = iscsiTargetEntityRepository.findAll();
    long diskSpaceInMb = 0;
    for (com.bitwisekaizen.sdss.agent.entity.IscsiTargetEntity iscsiTargetEntity : targetEntities) {
        diskSpaceInMb += iscsiTargetEntity.getCapacityInMb();
    }
    long diskSpaceInGb = ((long) (diskSpaceInMb / (com.bitwisekaizen.sdss.agent.config.AgentDiskSpaceHealthIndicator.MB_TO_GB_FACTOR)));
    provisionedDiskSpaceInGb.set(diskSpaceInGb);
    com.bitwisekaizen.sdss.agent.config.AgentDiskSpaceHealthIndicator.LOGGER.info(("Setting disk space to be in GB " + diskSpaceInGb));
}