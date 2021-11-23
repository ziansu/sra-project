private javax.mail.Message[] searchMailbox(javax.mail.Folder inbox) {
    javax.mail.search.SearchTerm searchTerm = new javax.mail.search.SubjectTerm("Ingress Portal");
    javax.mail.search.ReceivedDateTerm minDateTerm = new javax.mail.search.ReceivedDateTerm(javax.mail.search.ComparisonTerm.GT, activity.getMostRecentDate());
    searchTerm = new javax.mail.search.AndTerm(searchTerm, minDateTerm);
    try {
        return inbox.search(searchTerm);
    } catch (javax.mail.MessagingException e) {
        android.util.Log.e(com.einzig.ipst2.Utilities.EmailParseTask.TAG, e.toString());
        return null;
    }
}