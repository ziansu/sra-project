@com.fasterxml.jackson.annotation.JsonView(value = es.urjc.code.daw.api.RESTTagController.TagView.class)
@org.springframework.web.bind.annotation.RequestMapping(value = "/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<es.urjc.code.daw.api.Tag> getTagsByID(@org.springframework.web.bind.annotation.PathVariable
int id, javax.servlet.http.HttpServletRequest request) {
    java.security.Principal p = request.getUserPrincipal();
    java.lang.System.out.println(p.getName());
    if ((this.tagservice.findOne(((long) (id)))) != null) {
        return new org.springframework.http.ResponseEntity(this.tagservice.findOne(((long) (id))), org.springframework.http.HttpStatus.OK);
    }else {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
    }
}