public java.util.List<org.egov.works.models.masters.ScheduleOfRate> getSORList() {
    if (((estimateId) != null) && ((estimateDate) != null))
        return scheduleOfRateService.getScheduleOfRatesByCodeAndScheduleOfCategories(query, scheduleCategoryId.toString());
    else
        if ((estimateDate) != null)
            return scheduleOfRateService.getScheduleOfRatesByCodeAndScheduleOfCategories(query, scheduleCategoryId.toString());
        else
            return scheduleOfRateService.getScheduleOfRatesByCodeAndScheduleOfCategories(query, scheduleCategoryId.toString());
        
    
}