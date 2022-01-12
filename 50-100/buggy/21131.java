@javax.jws.WebMethod(operationName = "createPendingInternship")
public void createPendingInternship(@javax.jws.WebParam(name = "student")
java.lang.String student, @javax.jws.WebParam(name = "company")
java.lang.String company, @javax.jws.WebParam(name = "postDate")
java.lang.String postDate, @javax.jws.WebParam(name = "salary")
float salary, @javax.jws.WebParam(name = "title")
java.lang.String title, @javax.jws.WebParam(name = "description")
java.lang.String description, @javax.jws.WebParam(name = "tutor")
java.lang.String tutor, @javax.jws.WebParam(name = "phoneNumber")
java.lang.String phoneNumber, @javax.jws.WebParam(name = "department")
java.lang.String department, @javax.jws.WebParam(name = "location")
java.lang.String location) {
    model.DB db = new model.DB();
    db.createPendingInternship(company, company, postDate, salary, title, description, tutor, phoneNumber, department, location);
    db.closeConnection();
}