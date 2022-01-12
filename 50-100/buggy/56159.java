private java.lang.String teamTwoSetup(com.amazon.speech.speechlet.Session session) {
    teamTwoName = session.getAttribute("TeamTwoName").toString();
    currentTeamAttribute = session.getAttribute("TeamOneName").toString();
    session.setAttribute("TeamTwoScore", 0);
    return teamSetup.setupTeams(session.getAttribute("TeamOneName").toString(), session.getAttribute("TeamTwoName").toString());
}