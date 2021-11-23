@org.springframework.web.bind.annotation.RequestMapping(value = "/updateTpbo/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String update(@org.springframework.web.bind.annotation.PathVariable
final java.lang.Long id) {
    return "redirect:/tpbo/update/" + id;
}