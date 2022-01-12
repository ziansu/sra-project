public java.util.Collection<at.oculus.teamf.application.facade.IPatientQueue> getAllQueues() {
    java.util.Collection<at.oculus.teamf.application.facade.Doctor> doctors = null;
    at.oculus.teamf.persistence.Facade facade = at.oculus.teamf.persistence.Facade.getInstance();
    try {
        doctors = facade.getAll(at.oculus.teamf.application.facade.Doctor.class);
    } catch (at.oculus.teamf.persistence.exception.FacadeException e) {
        log.warn("Facade exception caught!");
    }
    java.util.Collection<at.oculus.teamf.application.facade.IPatientQueue> queues = new java.util.LinkedList<at.oculus.teamf.application.facade.IPatientQueue>();
    for (at.oculus.teamf.application.facade.Doctor doctor : doctors) {
        queues.add(doctor.getQueue());
    }
    return queues;
}