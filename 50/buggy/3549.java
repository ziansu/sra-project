@org.springframework.web.bind.annotation.RequestMapping(value = "/getEnergyInfo/{pid}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getEnergyInfo(@org.springframework.web.bind.annotation.PathVariable(value = "pid")
java.lang.Integer pid) {
    return test.SpringMVC.mvcController.myadb.getEnergyInfo(pid);
}