private void setTeamAttributes(java.lang.Object teamOne, com.amazon.speech.slu.Intent intent, com.amazon.speech.speechlet.Session session) {
    if (teamOne == null) {
        session.setAttribute("TeamOneName", intent.getSlot("TeamOne").getValue());
        currentTeamAttribute = ((java.lang.String) (session.getAttribute("TeamOneName")));
    }
    session.setAttribute("TeamTwoName", intent.getSlot("TeamTwo").getValue());
}