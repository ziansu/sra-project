private de.davelee.trams.data.Timetable convertToTimetable(final de.davelee.trams.model.TimetableModel timetableModel) {
    de.davelee.trams.data.Timetable timetable = new de.davelee.trams.data.Timetable();
    timetable.setName(timetableModel.getName());
    timetable.setRouteNumber(timetableModel.getRouteNumber());
    timetable.setValidFromDate(timetable.getValidFromDate());
    timetable.setValidToDate(timetableModel.getValidToDate());
    return timetable;
}