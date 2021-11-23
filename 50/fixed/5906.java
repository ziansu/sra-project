@org.springframework.web.bind.annotation.RequestMapping(value = "dataBinding/{foo}/{fruit}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String dataBinding() {
    return "views/dataBinding";
}