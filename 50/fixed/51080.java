@com.psk.pms.controller.RequestMapping(value = "/emp/myview/searchProject/searchProject.do", method = RequestMethod.GET)
@com.psk.pms.controller.ResponseBody
public java.util.List<java.lang.String> getAddressList(@com.psk.pms.controller.RequestParam(value = "term")
java.lang.String name) {
    return simulateSearchResult(name);
}