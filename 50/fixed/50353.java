public void retractMembership(final java.util.UUID pId) {
    if ((session.getFactHandle(getMemberOf(pId))) != null)
        session.retract(session.getFactHandle(getMemberOf(pId)));
    
}