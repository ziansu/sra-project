@org.springframework.web.bind.annotation.RequestMapping(value = "/find", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public com.mypetPrj.FormBean.FormBean find(@org.springframework.web.bind.annotation.RequestBody
com.mypetPrj.FormBean.FormBean formBean) {
    com.mypetPrj.mvc.HomeController.logger.info("*********************** find check!");
    return formBean;
}