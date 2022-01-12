@org.springframework.web.bind.annotation.GetMapping(value = "/{id}/values")
private java.util.Properties findById(@org.springframework.web.bind.annotation.PathVariable(value = "id")
final long id) {
    return propertiesService.findOne(id);
}