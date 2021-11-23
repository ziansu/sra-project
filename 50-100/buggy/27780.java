public at.oculus.teamf.application.facade.IExaminationProtocol createNewExaminationProtocol(java.util.Date starttime, java.util.Date endtime, java.lang.String description, at.oculus.teamf.application.facade.IPatient iPatient, at.oculus.teamf.application.facade.IDoctor iDoctor, at.oculus.teamf.application.facade.IOrthoptist iOrthoptist) {
    at.oculus.teamf.application.facade.ExaminationProtocol examinationProtocol = new at.oculus.teamf.application.facade.ExaminationProtocol(0, starttime, endtime, description, ((at.oculus.teamf.application.facade.Patient) (iPatient)), ((at.oculus.teamf.application.facade.Doctor) (iDoctor)), ((at.oculus.teamf.application.facade.Orthoptist) (iOrthoptist)), null);
    at.oculus.teamf.application.facade.Patient patient = ((at.oculus.teamf.application.facade.Patient) (iPatient));
    patient.addExaminationProtocol(examinationProtocol);
    return examinationProtocol;
}