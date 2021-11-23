public static java.util.ArrayList<MODELS.Mentee> getAllMentees() {
    java.util.ArrayList<MODELS.Mentee> allMentees = new java.util.ArrayList<>();
    allMentees = DAO.MenteeDAO.getMentees();
    return allMentees;
}