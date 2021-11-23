@java.lang.Override
public void loadDataToPage(com.cloupia.service.cIM.inframgr.forms.wizard.Page page, com.cloupia.model.cIM.ReportContext context, com.cloupia.service.cIM.inframgr.forms.wizard.WizardSession session) throws java.lang.Exception {
    java.lang.String query = context.getId();
    com.cisco.matday.ucsd.hp3par.tasks.hostsets.DeleteHostSetConfig form = new com.cisco.matday.ucsd.hp3par.tasks.hostsets.DeleteHostSetConfig();
    java.lang.String hostSet = query.split(";")[1];
    form.setHostSet(hostSet);
    page.getFlist().getByFieldId(((com.cisco.matday.ucsd.hp3par.reports.hostsets.actions.DeleteHostSetAction.FORM_ID) + ".hostSet")).setEditable(false);
    session.getSessionAttributes().put(com.cisco.matday.ucsd.hp3par.reports.hostsets.actions.DeleteHostSetAction.FORM_ID, form);
    page.marshallFromSession(com.cisco.matday.ucsd.hp3par.reports.hostsets.actions.DeleteHostSetAction.FORM_ID);
}