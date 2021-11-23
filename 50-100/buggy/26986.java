@java.lang.Override
public void success(com.appdest.hcue.model.AddPatientResponse additionalInfoResponse, retrofit.client.Response response) {
    hideLoader();
    android.content.Intent intent = new android.content.Intent(this, com.appdest.hcue.ChooseAppointmentActivityNew.class);
    intent.putExtra("DoctorDetails", selectedDoctorDetails);
    intent.putExtra("PhoneNumber", phNumber);
    intent.putExtra("PatientInfo", additionalInfoResponse);
    intent.putExtra("isNoMobile", isNoMobile);
    startActivity(intent);
    finish();
}