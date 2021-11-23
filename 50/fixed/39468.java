private java.lang.String getSubjectInitials(java.lang.String subject) {
    if ((subject.length()) > 3) {
        return subject.substring(0, 3);
    }else
        return subject;
    
}