public java.lang.String parseTicketID(java.lang.String subject) {
    java.lang.String[] full_subject = subject.split("#");
    if ((full_subject[1]) != "") {
        java.lang.String second_part_subject = full_subject[1];
        java.lang.String trimmed_subject = second_part_subject.trim();
        java.lang.String[] id = trimmed_subject.split(" ");
        return id[0];
    }else {
        return subject.trim();
    }
}