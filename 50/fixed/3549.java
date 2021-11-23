@org.springframework.web.bind.annotation.RequestMapping(value = "/getEnergyInfo", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getEnergyInfo() {
    return test.SpringMVC.mvcController.myadb.getEnergyInfo();
}