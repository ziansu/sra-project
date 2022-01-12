@org.springframework.web.bind.annotation.RequestMapping
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Iterable<liquid.container.domain.ContainerSubtype> findAll() {
    return containerSubtypeService.findAll();
}