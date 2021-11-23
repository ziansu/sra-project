private void setTeamAttributes(com.amazon.speech.slu.Intent intent, com.amazon.speech.speechlet.Session session) {
    if ((session.getAttribute("TeamOneName")) == null) {
        session.setAttribute("TeamOneName", intent.getSlot("TeamOne").getValue());
        currentTeamAttribute = ((java.lang.String) (session.getAttribute("TeamOneName")));
    }
    session.setAttribute("TeamTwoName", intent.getSlot("TeamTwo").getValue());
}