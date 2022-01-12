@org.springframework.web.bind.annotation.GetMapping(value = "/listSocieta/{id}")
public java.lang.String mostraSocieta(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id, org.springframework.ui.Model model) {
    it.uniroma3.triathlon.model.Societa societa = societaService.findOne(id);
    model.addAttribute("societas", true);
    model.addAttribute("elencoSocieta", societaService.groupedByRegione(societaService.findAll()));
    model.addAttribute("societa", societa);
    model.addAttribute("societaPanel", true);
    return "societa";
}