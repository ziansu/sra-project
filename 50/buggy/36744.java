@org.springframework.web.bind.annotation.RequestMapping(value = "pathVariables/{foo}/{fruit}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String pathVars(@org.springframework.web.bind.annotation.PathVariable
java.lang.String foo, @org.springframework.web.bind.annotation.PathVariable
java.lang.String fruit) {
    return "views/html";
}