@java.lang.Override
public java.util.List<java.util.ArrayList<java.lang.String>> queryStudentRegistrationHistory(scrs.ShibbolethAuth.Token token, int studentID) {
    java.util.List<java.util.ArrayList<java.lang.String>> result = new java.util.ArrayList<>();
    try {
        result = queryStudentRegistrationHistory2(token, studentID);
    } catch (scrs.SCRSException e) {
        java.lang.System.out.println(e.getMessage());
    }
    return result;
}