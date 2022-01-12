public models.transit.ServiceCalendar clone() {
    models.transit.ServiceCalendar r = new models.transit.ServiceCalendar();
    r.agencyId = agencyId;
    r.description = description;
    r.gtfsServiceId = gtfsServiceId;
    r.monday = monday;
    r.tuesday = tuesday;
    r.wednesday = wednesday;
    r.thursday = thursday;
    r.friday = friday;
    r.saturday = saturday;
    r.sunday = sunday;
    r.startDate = startDate;
    r.endDate = endDate;
    return r;
}