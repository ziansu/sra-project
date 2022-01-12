@com.eagle.rest.POST
@com.eagle.rest.Path(value = com.eagle.consts.RestPath.CHANNEL)
public com.eagle.entity.EagleRecordEntity recordChannel(com.eagle.entity.EagleRecordEntity eagleRecordEntity) {
    return service.JobsService.createAndPersistNewJob(eagleRecordEntity);
}