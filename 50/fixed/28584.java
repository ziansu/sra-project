public void start() {
    propertieHandler = de.privat.ciupka.schedule.logic.schedule.PropertieHandler.getInstance();
    scheduleHandler = new de.privat.ciupka.schedule.logic.schedule.ScheduleHandler();
    loadAllSubjects();
}