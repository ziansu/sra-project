@org.springframework.web.bind.annotation.RequestMapping(value = "/edit/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String editMagazineform(@org.springframework.web.bind.annotation.ModelAttribute(value = "magazine")
com.instapost.domain.Magazine magazine, org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable(value = "id")
long id) {
    magazine = magazineService.findoneMagazine(id);
    model.addAttribute("magazine", magazine);
    return "magazine/magazineEditForm";
}