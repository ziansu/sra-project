@org.springframework.web.bind.annotation.RequestMapping(value = "/menu/{id}")
public com.tramppizza.domains.Pizza getPizza(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    return menuService.getPizza(id);
}