@org.openmrs.module.muzimabiometrics.web.controller.ResponseBody
@org.openmrs.module.muzimabiometrics.web.controller.RequestMapping(value = "fingerprint/addFingerprint.form", method = RequestMethod.POST, headers = { "content-type=application/json" })
public java.util.List<org.openmrs.module.muzimabiometrics.model.PatientFingerPrintModel> addFingerprint(@org.openmrs.module.muzimabiometrics.web.controller.RequestBody
java.lang.String patientWithFingerprint) throws java.lang.Exception {
    org.openmrs.module.muzimabiometrics.api.MuzimaFingerprintService service = org.openmrs.api.context.Context.getService(org.openmrs.module.muzimabiometrics.api.MuzimaFingerprintService.class);
    org.openmrs.module.muzimabiometrics.MuzimaFingerprint muzimaFingerprint = service.getFingerprintByPatientUUID(patientWithFingerprint);
    java.lang.Boolean fingerprintAlreadyExist = false;
    if (muzimaFingerprint != null) {
        fingerprintAlreadyExist = true;
    }
    org.openmrs.module.muzimabiometrics.model.PatientFingerPrintModel patient = service.addFingerprintToPatient(patientWithFingerprint, firstImageBytes, secondImageBytes, thirdImageBytes, fingerprintAlreadyExist);
    java.util.List<org.openmrs.module.muzimabiometrics.model.PatientFingerPrintModel> patientFingerPrintModels = new java.util.ArrayList<org.openmrs.module.muzimabiometrics.model.PatientFingerPrintModel>();
    patientFingerPrintModels.add(patient);
    return patientFingerPrintModels;
}