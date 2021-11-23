@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json")
public org.springframework.http.ResponseEntity<com.app.model.Student> saveStudent(@org.springframework.web.bind.annotation.RequestBody
com.app.model.Student student) {
    java.lang.System.out.println(((("Student: " + student) + " Username :") + (student.getUserName())));
    student = studentService.save(student);
    return new org.springframework.http.ResponseEntity(student, org.springframework.http.HttpStatus.CREATED);
}