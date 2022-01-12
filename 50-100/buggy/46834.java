@java.lang.Override
public java.util.List<java.util.ArrayList<java.lang.String>> queryStudentRegistrationHistory(scrs.ShibbolethAuth.Token token, int studentID) {
    java.util.List<java.util.ArrayList<java.lang.String>> result = null;
    try {
        result = queryStudentRegistrationHistory2(token, studentID);
    } catch (scrs.SCRSException e) {
        java.lang.System.out.println(e.getMessage());
        return null;
    }
    return result;
}