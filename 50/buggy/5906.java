@org.springframework.web.bind.annotation.RequestMapping(value = "dataBinding/{foo}/{fruit}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String dataBinding(@javax.validation.Valid
org.springframework.samples.mvc.views.JavaBean javaBean, org.springframework.ui.Model model) {
    return "views/dataBinding";
}