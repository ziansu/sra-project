private org.medipi.medication.Schedule getExistingSchedule(java.time.LocalDate date, org.medipi.medication.Medication medication, java.lang.String patientUuid) {
    java.util.List<org.medipi.medication.Schedule> existing_schedules = scheduleDAOimpl.findByMedicationAndPatient(medication, patientUuid);
    for (org.medipi.medication.Schedule schedule : existing_schedules) {
        if (((schedule.getAssignedEndDate()) == null) || (schedule.getAssignedEndDate().toLocalDate().isAfter(date))) {
            return schedule;
        }
    }
    return null;
}