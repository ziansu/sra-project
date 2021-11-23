@java.lang.Override
public java.util.List<java.util.ArrayList<java.lang.String>> queryClass(int courseID, java.lang.String courseName, java.lang.String location, java.lang.String term, java.lang.String department, java.lang.String classType, java.lang.String instructorName) {
    java.util.List<java.util.ArrayList<java.lang.String>> result = new java.util.ArrayList<>();
    try {
        result = queryClass2(courseID, courseName, location, term, department, classType, instructorName);
    } catch (scrs.SCRSException e) {
        java.lang.System.out.println(e.getMessage());
    }
    return result;
}