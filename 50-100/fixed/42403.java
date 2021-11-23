public static java.lang.String editMentor(MODELS.Mentor m) {
    java.lang.String status = "";
    int userResult = DAO.UserDAO.editUser(m);
    int result = DAO.MentorDAO.editMentorDetails(m);
    if ((result == 1) && (userResult == 1)) {
        status = "Changes have been saved successfully!";
    }else {
        status = "Changes could not be saved!";
    }
    return status;
}