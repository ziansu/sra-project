@org.springframework.web.bind.annotation.RequestMapping(value = "/{owner}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.example.docker.repository.Container create(@org.springframework.web.bind.annotation.PathVariable
java.lang.String owner) {
    service.createContainer(owner);
    return new com.example.docker.repository.Container("lims1", 8082);
}