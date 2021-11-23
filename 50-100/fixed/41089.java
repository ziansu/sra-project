@org.springframework.web.bind.annotation.RequestMapping(value = "/mkup/find/{stdName}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.util.List<mastery.model.Lesson>> findMkupLsons(@org.springframework.web.bind.annotation.RequestBody
mastery.model.Lesson lson, @org.springframework.web.bind.annotation.PathVariable(value = "stdName")
java.lang.String stdName) {
    java.util.List<mastery.model.Lesson> list = new java.util.ArrayList<mastery.model.Lesson>();
    list = sAgent.schMkup(lson, stdName);
    java.util.Collections.sort(list);
    mastery.controller.RestApiController.logger.info(list.toString());
    return new org.springframework.http.ResponseEntity<java.util.List<mastery.model.Lesson>>(list, org.springframework.http.HttpStatus.OK);
}