@org.springframework.web.bind.annotation.RequestMapping(value = "/updateTpbo/{name}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String update(@org.springframework.web.bind.annotation.PathVariable
final java.lang.String name) {
    return "redirect:/tpbo/update/" + name;
}