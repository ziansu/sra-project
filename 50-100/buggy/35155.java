private java.lang.String getTeamDeckXML(int teamId, int classId) {
    java.util.ArrayList<java.lang.Integer> teamIds = edu.virginia.bookmark.DatabaseManager.loadTeamStudentIds(teamId, classId);
    java.lang.String xml = "<team_deck>";
    for (int studentId : teamIds) {
        java.lang.String deck = getStudentDeckXML(studentId, classId);
        xml += deck;
    }
    xml += "</team_deck>";
    return xml;
}