@org.springframework.web.bind.annotation.RequestMapping(value = "adminStudentInfo", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.Object> handleStudentObtain(javax.servlet.http.HttpServletRequest request) {
    java.util.Map<java.lang.String, java.lang.Object> studentMap = null;
    java.util.List<com.imis.domain.entities.Student> studentList = null;
    try {
        studentList = studentService.getAdminStudentInfo();
        studentMap = new java.util.HashMap<java.lang.String, java.lang.Object>();
        studentMap.put("data", studentList);
        return studentMap;
    } catch (java.lang.Exception ex) {
        return null;
    }
}