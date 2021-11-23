@org.springframework.web.bind.annotation.GetMapping(value = "/showAllPictures")
public java.lang.String showAll(org.springframework.ui.Model model) {
    model.addAttribute("pictures", pictureService.findAll());
    model.addAttribute("postMode", "/showPicturesByAuthor");
    model.addAttribute("selectText", "Picture List");
    model.addAttribute("onClickSelect", "");
    model.addAttribute("backPage", "location.href='/'");
    model.addAttribute("mostraAzioni", true);
    return "pictures";
}