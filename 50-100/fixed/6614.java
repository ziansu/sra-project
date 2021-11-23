@java.lang.Override
public void postHandle(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1, java.lang.Object arg2, org.springframework.web.servlet.ModelAndView arg3) throws java.lang.Exception {
    if (arg3 == null)
        return ;
    
    arg3.addObject("baseurl", com.cportal.config.ConfigDB.retrnConf().getBASEURL());
    java.lang.System.out.println(("---Request Completed---" + (com.cportal.config.ConfigDB.getBASEURL())));
}