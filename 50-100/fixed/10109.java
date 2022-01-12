private javax.mail.Message[] searchMailbox(javax.mail.Folder inbox) throws javax.mail.MessagingException {
    javax.mail.search.SearchTerm searchTerm = new javax.mail.search.SubjectTerm("Ingress Portal");
    javax.mail.search.ReceivedDateTerm minDateTerm = new javax.mail.search.ReceivedDateTerm(javax.mail.search.ComparisonTerm.GT, activity.getMostRecentDate());
    searchTerm = new javax.mail.search.AndTerm(searchTerm, minDateTerm);
    return inbox.search(searchTerm);
}