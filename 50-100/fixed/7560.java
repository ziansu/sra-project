@org.junit.Test
public void checkUpperBoundMessageCount() {
    java.lang.String msgcnt = "128";
    us.dot.its.jpo.ode.j2735.dsrc.TravelerInformation travelerInfo = new us.dot.its.jpo.ode.j2735.dsrc.TravelerInformation();
    try {
        travelerInfo.setMsgCnt(new us.dot.its.jpo.ode.j2735.dsrc.MsgCount(java.lang.Integer.parseInt(msgcnt)));
    } catch (java.lang.RuntimeException e) {
        assertEquals(java.lang.IllegalArgumentException.class, e.getClass());
    }
}