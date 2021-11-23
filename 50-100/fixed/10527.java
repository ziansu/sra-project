public java.util.List<org.egov.works.models.masters.ScheduleOfRate> getSORList() {
    if (((estimateId) != null) && ((estimateDate) != null))
        return scheduleOfRateService.getScheduleOfRatesByCodeAndScheduleOfCategories(query, scheduleCategoryId.toString(), estimateDate);
    else
        if ((estimateDate) != null)
            return scheduleOfRateService.getScheduleOfRatesByCodeAndScheduleOfCategories(query, scheduleCategoryId.toString(), estimateDate);
        else
            return scheduleOfRateService.getScheduleOfRatesByCodeAndScheduleOfCategories(query, scheduleCategoryId.toString(), estimateDate);
        
    
}