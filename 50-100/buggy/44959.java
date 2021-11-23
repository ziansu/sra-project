public void addMember(java.lang.String id, java.lang.String email) {
    if (((getMember(id)) == null) && ((email.length()) > 0)) {
        members.add(new com.tddmem.Member(id, email));
    }
    if ((id != null) && (id.isEmpty())) {
        emails.add(email);
    }
}