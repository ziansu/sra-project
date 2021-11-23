public void refreshView(ch.bfh.btx8081.w2015.blue.HealthVisApp.Model.Patient pat) {
    this.pat = pat;
    patDetInfoView.setPatient(pat);
    patDetOverView.setPatient(pat);
    patDetAppView.setPatient(pat);
    com.vaadin.ui.Label caption = new com.vaadin.ui.Label(((("" + (pat.getFirstName())) + " ") + (pat.getName())));
    patientTabSheet.setCaption(caption.getValue());
}