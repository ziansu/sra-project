@com.psk.pms.controller.RequestMapping(value = "/emp/myview/searchProject/searchProject.do", method = RequestMethod.GET)
@com.psk.pms.controller.ResponseBody
public java.util.List<java.lang.String> getAddressList(@com.psk.pms.controller.RequestParam
java.lang.String input) {
    return simulateSearchResult(input);
}