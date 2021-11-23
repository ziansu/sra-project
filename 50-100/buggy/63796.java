@org.springframework.web.bind.annotation.RequestMapping(value = "/enrollUser", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public void enrollUser(@org.springframework.web.bind.annotation.RequestParam(value = "data")
java.lang.String data, @org.springframework.web.bind.annotation.RequestBody
com.ir.form.GenerateCourseCertificateForm generateCourseCertificateForm, javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse response, javax.servlet.http.HttpSession session) throws java.io.IOException {
    new com.zentech.logger.ZLogger("getModule", ("getModule............" + data), "CommonController.java");
    java.lang.String courseName = data;
    java.lang.String data1 = adminService.enrollUser(courseName);
    java.io.PrintWriter out = response.getWriter();
    com.google.gson.Gson g = new com.google.gson.Gson();
    java.lang.String newList = g.toJson(data1);
    java.lang.System.out.println(("newList " + newList));
    out.write(newList);
    out.flush();
}