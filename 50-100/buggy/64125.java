protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String op = request.getParameter("op");
    switch (op) {
        case student.StudentAction.OP_GET_STUDENT_LIST :
            getStudentList(request, response);
            break;
        case student.StudentAction.OP_GET_STUDENT_LIST_BY_COURSE_ID :
            getStudentListByCourseId(request, response);
            break;
        case student.StudentAction.OP_GET_SEND_MAIL_INFO :
            getSendMailInfo(request, response);
            break;
        case student.StudentAction.OP_GET_CERTIFICATION_INFO :
            getCertificationInfo(request, response);
            break;
        default :
            break;
    }
}