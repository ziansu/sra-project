@org.springframework.web.bind.annotation.RequestMapping(value = "/FindById/{id}")
public com.makotojava.learn.odot.model.Category findById(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    return getCategoryService().findById(id);
}