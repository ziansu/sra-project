@java.lang.Override
public void initModel() {
    java.lang.String appointmentId = getIntent().getStringExtra(MainApplication.APPOINTMENT_ID_EXTRA);
    appointment = getModelFacade().getAppointment(appointmentId);
    questions = getModelFacade().questionList.questions;
    providers = getModelFacade().providerList.providers;
    com.petrodevelopment.copdapp.util.U.log(this, ("opened appointment with id: " + appointmentId));
}