private javax.mail.Message[] searchMailbox(javax.mail.Folder folder) throws javax.mail.MessagingException {
    com.einzig.ipst2.util.PreferencesHelper helper = new com.einzig.ipst2.util.PreferencesHelper(activity.getApplicationContext());
    org.joda.time.LocalDate lastParseDate = getLastParseDate(helper.get(helper.parseDateKey()));
    return folder.search(getSearchTerm(lastParseDate, false));
}