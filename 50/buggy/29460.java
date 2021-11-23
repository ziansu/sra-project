@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = { "multipart/form-data" })
public void create(@org.springframework.web.bind.annotation.RequestPart(value = "pet")
java.lang.String petString, @org.springframework.web.bind.annotation.RequestPart(value = "image")
org.springframework.web.multipart.MultipartFile image) throws java.io.IOException {
    petService.save(new com.fasterxml.jackson.databind.ObjectMapper().readValue(petString, com.wk.Pet.class), image);
}