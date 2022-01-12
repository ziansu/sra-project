@org.springframework.web.bind.annotation.RequestMapping(value = "/getAll", method = { org.springframework.web.bind.annotation.RequestMethod.GET , org.springframework.web.bind.annotation.RequestMethod.POST })
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.java4.des.entity.Exam> getAll(javax.servlet.http.HttpSession session, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.util.List<com.java4.des.entity.Exam> list = new java.util.ArrayList<com.java4.des.entity.Exam>();
    try {
        list = examService.getAllExams();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return list;
}