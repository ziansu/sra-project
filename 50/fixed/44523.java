public static fi.letsdev.yourhealth.repository.PatientRepository getInstance() {
    if ((fi.letsdev.yourhealth.repository.PatientRepository.instance) == null) {
        fi.letsdev.yourhealth.repository.PatientRepository.instance = new fi.letsdev.yourhealth.repository.PatientRepository();
    }
    return fi.letsdev.yourhealth.repository.PatientRepository.instance;
}