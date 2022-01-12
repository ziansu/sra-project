public java.lang.String store(javax.portlet.PortletPreferences prefs) throws java.io.IOException, javax.portlet.ReadOnlyException, javax.portlet.ValidatorException {
    prefs.setValue(org.xcolab.portlets.contactform.ContactPreferences.MESSAGE_FORMAT_PREF, messageFormat);
    prefs.setValue(org.xcolab.portlets.contactform.ContactPreferences.MESSAGE_SUBJECT_PREF, messageSubject);
    prefs.setValue(org.xcolab.portlets.contactform.ContactPreferences.EXPAND_LINK_TEXT_PREF, expandLinkText);
    prefs.setValue(org.xcolab.portlets.contactform.ContactPreferences.RECIPIENTS_PREF, recipients);
    prefs.store();
    return null;
}