@org.springframework.web.bind.annotation.GetMapping
private java.util.Properties findById(final long id) {
    final java.util.Properties properties = propertiesService.findOne(id);
    return properties;
}