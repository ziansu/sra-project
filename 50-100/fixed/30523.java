@org.springframework.web.bind.annotation.RequestMapping(value = "/student/commit")
public org.springframework.web.servlet.ModelAndView showStudentCommitPage(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    org.springframework.web.servlet.ModelAndView result = new org.springframework.web.servlet.ModelAndView("studentCommit");
    java.lang.String student = request.getParameter("student");
    java.util.List<org.gitmining.monitor.bean.StudentComment> comments = new java.util.ArrayList<org.gitmining.monitor.bean.StudentComment>();
    if (student != null) {
        result.addObject("student", student);
        comments = studentService.getStudentComments(student);
    }
    result.addObject("comments", comments);
    return result;
}