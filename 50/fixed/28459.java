@org.springframework.web.bind.annotation.RequestMapping(path = "Problema/{probID}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public models.Problema ProblemaDelete(@org.springframework.web.bind.annotation.PathVariable
int probID) {
    return Problema()[0];
}