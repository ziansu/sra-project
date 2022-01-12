@java.lang.Override
public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler, org.springframework.web.servlet.ModelAndView modelAndView) throws java.lang.Exception {
    modelAndView.addObject("baseurl", com.cportal.config.ConfigDB.retrnConf().getBASEURL());
    java.lang.System.out.println(("---Request Completed---" + (com.cportal.config.ConfigDB.getBASEURL())));
}