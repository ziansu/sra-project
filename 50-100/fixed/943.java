@java.lang.Override
public de.thb.ue.backend.model.Tutor getByUsername(java.lang.String username) {
    de.thb.ue.backend.model.Tutor tutor = tutorRepo.findByUsername(username);
    if (tutor == null) {
        tutor = getLdapUser(username);
        if (tutor != null) {
            tutorRepo.save(tutor);
        }
    }else {
        if (isDisabled(username)) {
            tutor = null;
        }
    }
    return tutor;
}