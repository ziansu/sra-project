@org.springframework.web.bind.annotation.RequestMapping(value = "/getDevices", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getDevices(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    return test.SpringMVC.mvcController.myadb.getDeviceInfo();
}