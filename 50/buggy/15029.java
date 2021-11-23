@org.springframework.web.bind.annotation.RequestMapping(value = "/getBasicDetail/")
public com.web.model.BasicDetailModel getBasicDetail(org.springframework.ui.Model model) {
    com.web.services.BasicDetailService basicDetailService = new com.web.services.BasicDetailService();
    java.lang.System.out.println("In basic detail controller");
    return basicDetailService.getBasicDetail();
}