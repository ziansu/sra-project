private void addAppointmentBinding(org.rapla.entities.domain.Appointment appRef, org.rapla.entities.storage.ReferenceInfo<org.rapla.entities.domain.Allocatable> allocationId) {
    java.util.SortedSet<org.rapla.entities.domain.Appointment> set = appointmentMap.get(allocationId);
    if (set == null) {
        set = new java.util.TreeSet<org.rapla.entities.domain.Appointment>(new org.rapla.entities.domain.AppointmentStartComparator());
        appointmentMap.put(allocationId, set);
    }
    set.add(appRef);
}