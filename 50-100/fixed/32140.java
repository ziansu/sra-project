@com.app.controller.RequestMapping(value = "/mymdb/people/add", method = RequestMethod.POST)
public java.lang.String addPerson(@com.app.controller.RequestParam(value = "name")
java.lang.String name, @com.app.controller.RequestParam(value = "dateOfBirth", required = false)
@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd")
java.util.Date dateOfBirth, @com.app.controller.RequestParam(value = "description", required = false)
java.lang.String description, @com.app.controller.RequestParam(value = "image", required = false)
org.springframework.web.multipart.MultipartFile image, @com.app.controller.RequestParam(value = "imageTitle", required = false)
java.lang.String imageTitle) {
    com.app.person.Person person = new com.app.person.Person();
    if (name != null)
        person.setName(name);
    
    if (dateOfBirth != null);
    person.setDateOfBirth(dateOfBirth);
    if (description != null)
        person.setDescription(description);
    
    person.setImagesObjectIds(uploadImage(image, imageTitle));
    personService.addOrUpdatePerson(person);
    return "addPerson";
}