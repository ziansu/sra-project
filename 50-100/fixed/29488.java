public boolean addNewMember(java.lang.String Id, java.lang.String email) {
    boolean added = false;
    if (!(email.isEmpty())) {
        com.tddair.Member m = new com.tddair.Member(Id, email);
        if (m != null) {
            if ((getById(Id)) == null) {
                members.add(m);
                added = true;
            }
        }
    }
    return added;
}