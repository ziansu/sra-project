@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.DELETE, value = "/menu/{id}")
public void deletePizza(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    menuService.deletePizza(id);
}