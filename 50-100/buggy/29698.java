@java.lang.Override
public java.util.List<hr.eestec_zg.frmscore.domain.models.Company> getCompaniesForWhichThereAreNoTasksForEvent(java.lang.Long eventId) {
    if (eventId == null) {
        throw new java.lang.IllegalArgumentException("Event id not defined");
    }
    java.util.List<java.lang.Long> companyIds = taskRepository.getCompanyIdsByEventId(eventId);
    if (companyIds.isEmpty()) {
        return companyRepository.getCompaniesWhichAreNotInIdList(companyIds);
    }else {
        return companyRepository.getCompanies();
    }
}