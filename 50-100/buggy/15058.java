@java.lang.Override
public java.util.List<com.mesBackend.processTask.model.ChangeMain> getChangeMainFilter(boolean hasSearchPart, java.util.Set<java.lang.Integer> processSrnoSet, com.mesBackend.factorySetting.model.Machines machine, com.mesBackend.system.model.MachineStatus machineStatus, int toolSetId, java.util.Date startDate, java.util.Date endDate) {
    org.springframework.data.jpa.domain.Specification<com.mesBackend.processTask.model.ChangeMain> filter = specificationSevice.changeMainfilter(hasSearchPart, processSrnoSet, machine.getMachineId(), toolSetId, startDate, endDate, machineStatus.getMachineStatusId());
    java.util.List<com.mesBackend.processTask.model.ChangeMain> changeMain = changeMainDao.findAll(org.springframework.data.jpa.domain.Specifications.where(filter));
    return changeMain;
}