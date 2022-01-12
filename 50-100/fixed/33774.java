private void sendEmail(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    cn.tf.entities.AdminInfo adminInfo = cn.tf.utils.WebUtil.fillBean(request, cn.tf.entities.AdminInfo.class);
    java.lang.String code = org.apache.commons.lang.RandomStringUtils.randomNumeric(5);
    adminInfo.setCode(code);
    javax.servlet.http.HttpSession session = request.getSession();
    session.setAttribute("code", code);
    session.setMaxInactiveInterval((1 * 60));
    cn.tf.utils.SendMailThread smt = new cn.tf.utils.SendMailThread(adminInfo);
    smt.start();
    this.out(response, 1);
}