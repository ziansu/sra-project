@java.lang.Override
public java.util.ArrayList<models.Course> getCoursesByCredit(int credit) {
    java.util.ArrayList<models.Course> courses = new java.util.ArrayList<models.Course>();
    com.mongodb.DBCursor cursor = collection.find();
    while (cursor.hasNext()) {
        com.mongodb.DBObject semesterObject = cursor.next();
        models.Semester semester = new models.Semester(semesterObject.get("name").toString(), java.lang.Integer.parseInt(semesterObject.get("id").toString()));
        semesters.add(semester);
    } 
    return semesters;
}