@org.springframework.web.bind.annotation.RequestMapping(value = "/pet1/{petId}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object DeletePet(@org.springframework.web.bind.annotation.PathVariable(value = "petId")
long petId, @org.springframework.web.bind.annotation.RequestParam
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam
java.lang.String status) {
    com.rest.model.Status status1 = new com.rest.model.Status();
    status1.setCode(204);
    status1.setMessage("Pet Deleted successfully");
    return status1;
}