@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (!(o instanceof com.linkedin.r2.message.rest.BaseRestMessage)) {
        return false;
    }
    com.linkedin.r2.message.rest.BaseRestMessage that = ((com.linkedin.r2.message.rest.BaseRestMessage) (o));
    return (_headers.equals(that._headers)) && (_cookies.equals(that._cookies));
}