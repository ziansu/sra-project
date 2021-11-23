@java.lang.Override
public java.lang.String getMatchResultComment() throws java.lang.IllegalStateException {
    if ((matchStatus) != (MATCH_FINISHED)) {
        throw new java.lang.IllegalStateException("Illegal match state");
    }
    return "The match has come to an end.";
}