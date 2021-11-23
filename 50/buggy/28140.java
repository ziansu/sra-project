@java.lang.Override
public java.util.Set<org.fenixedu.academic.domain.util.email.ReplyTo> getReplyTosSet() {
    if (getReplyTosSet().isEmpty()) {
        addReplyTos(new org.fenixedu.academic.domain.util.email.CurrentUserReplyTo());
    }
    return super.getReplyTosSet();
}