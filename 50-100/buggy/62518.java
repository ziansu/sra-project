@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/edit-registrated-user/modal-window", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.lang.String> showModalWindow(@org.springframework.web.bind.annotation.RequestBody
org.registrator.community.dto.JSON.ResourceNumberDTOJSON resourceNumberDtoJson, org.springframework.validation.BindingResult result) {
    logger.info("begin");
    userService.createResourceNumber(resourceNumberDtoJson);
    userService.createTome(resourceNumberDtoJson);
    logger.info("end");
    return new org.springframework.http.ResponseEntity<java.lang.String>(org.springframework.http.HttpStatus.OK);
}