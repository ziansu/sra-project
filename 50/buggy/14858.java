@org.springframework.web.bind.annotation.RequestMapping(value = "/warlight/engine/view/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String view(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String id) throws java.lang.Exception {
    return new java.lang.String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(((((uploadsDir) + "/") + id) + "."))));
}