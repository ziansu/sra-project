@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    ch.bfh.bti7081.s2016.yellow.SwissMD.model.dto.PatientDTO patient = null;
    try {
        patient = findPersonById(person.getId());
    } catch (ch.bfh.bti7081.s2016.yellow.SwissMD.model.exception.MeetingStateException e) {
        e.printStackTrace();
    }
    ch.bfh.bti7081.s2016.yellow.SwissMD.model.util.PatientInSessionManager.getInstance().setPatientInSession(patient, null, getUI().getSession());
    getUI().getNavigator().navigateTo(NavigationIndex.PERSONVIEW.getNavigationPath());
}